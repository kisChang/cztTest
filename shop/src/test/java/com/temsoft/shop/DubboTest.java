package com.temsoft.shop;

import com.temsoft.oms.order.service.*;

import javax.annotation.Resource;

/**
 * 描述
 *
 * @author KisChang
 * @version 1.0
 */
public class DubboTest extends TestBase {

    @Resource
    private OrdersMngService ordersMngService;
    @Resource
    private OrderBillService orderBillService;
    @Resource
    private OrdersRefundService ordersRefundService;
    @Resource
    private OrderFindService orderFindService;
    @Resource
    private OrderCreateService orderCreateService;
    @Resource
    private OrderOptService orderOptService;


    @Override
    public void testUpdate() {
        run(() -> orderOptService.checkWxOrderStat(null));
        run(() -> orderOptService.checkOrderStat(1));

        run(() -> ordersMngService.updateOrderGoods(null, null));
        run(() -> orderCreateService.update(null));
        run(() -> orderFindService.findOrderGoodsById(1));
        run(() -> ordersRefundService.canalOrders(null));
        run(() -> orderBillService.settleOrderGoods(null, null));
    }

    public interface RunTry {
        void run() throws Exception;
    }

    public void run(RunTry runTry){
        try {
            runTry.run();
        }catch (Exception e){
            //可以取消该行注释，查看详细的错误输出
//            e.printStackTrace();
            boolean ok = true;
            for (StackTraceElement trace : e.getStackTrace()){
                String str = trace.getClassName() + trace.getMethodName();
                if (str.contains("org.springframework.aop")  && str.contains("CglibAopProxy$CglibMethod")){
                    // System.out.println(str);
                    ok = false;
                }
            }
            if (ok){
                StackTraceElement trace = e.getStackTrace()[0];
                System.out.println("出问题的类： " + trace .getClassName() + "." + trace.getMethodName());
            }
        }
    }

}

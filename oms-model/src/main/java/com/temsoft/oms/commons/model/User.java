package com.temsoft.oms.commons.model;

/**
 * 可登录用户
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年10月29日
 * @since 1.0
 */
public interface User extends java.io.Serializable {

    long getId();

    void setId(long id);

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    String getSalt();

    void setSalt(String salt);

    String getCredentialsSalt();

}

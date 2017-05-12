<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


[
<s:iterator id="element" value="members" status="status">
   {
      "u_id":"<s:property value='#element.u_id' />", 
      "u_username":"<s:property value='#element.u_username' />",
      "u_password":"<s:property value='#element.u_password' />",
      "u_realname":"<s:property value='#element.u_realname' />",
      "u_email":"<s:property value='#element.u_email' />",
      "u_phone":"<s:property value='#element.u_phone' />",
      "u_deptid":"<s:property value='#element.u_deptid' />",
      "u_identity":"<s:property value='#element.u_identity' />"
   }
   <s:if test="#status.count < members.size">,</s:if>

</s:iterator>
]


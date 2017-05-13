<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


[
<s:iterator id="element" value="mails" status="status">
   {
      "mail_id":"<s:property value='#element.mail_id' />", 
      "mail_from_username":"<s:property value='#element.mail_from_username' />",
      "mail_to_username":"<s:property value='#element.mail_to_username' />",
      "mail_sendtime":"<s:property value='#element.mail_sendtime' />",
      "mail_letter":"<s:property value='#element.mail_letter' />"
   }
   <s:if test="#status.count < mails.size">,</s:if>

</s:iterator>
]


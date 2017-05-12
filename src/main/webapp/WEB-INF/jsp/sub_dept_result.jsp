<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


[
<s:iterator id="element" value="departmentss" status="status">
   {
      "dept_id":"<s:property value='#element.deptId' />", 
      "dept_number":"<s:property value='#element.deptNumber' />",
      "dept_name":"<s:property value='#element.deptName' />",
      "dept_super":"<s:property value='#element.deptSuper' />"
   }
   <s:if test="#status.count < departmentss.size">,</s:if>

</s:iterator>
]


<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

{"files": 
[
<s:iterator id="element" value="files" status="status" >
   {
      "name":"<s:property value='#element.file_filename' />", 
      "path":"<s:property value='#element.flie_pathname' />",
      "time":"<s:property value='#element.file_uploadtime' />",
      "size":"<s:property value='#element.file_size' />"
   }
   <s:if test="#status.count < files.size">,</s:if>   

</s:iterator>
] }


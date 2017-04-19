<html>
<body>
<h2>Hello World!</h2>
1. Server info: <%= application.getServerInfo() %><br>
2. Servlet version:<%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
3. JSP version: <%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %><br>
4. Java version: <%= System.getProperty("java.version") %><br>  
</body>
</html>

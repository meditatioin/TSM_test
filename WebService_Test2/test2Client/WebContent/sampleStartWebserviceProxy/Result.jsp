<%@page contentType="text/html;charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
	<H1>Result</H1>

	<jsp:useBean id="sampleStartWebserviceProxyid" scope="session"
		class="net.test.StartWebserviceProxy" />
	<%
		if (request.getParameter("endpoint") != null
				&& request.getParameter("endpoint").length() > 0)
			sampleStartWebserviceProxyid.setEndpoint(request
					.getParameter("endpoint"));
	%>

	<%
		String method = request.getParameter("method");
		int methodID = 0;
		if (method == null)
			methodID = -1;

		if (methodID != -1)
			methodID = Integer.parseInt(method);
		boolean gotMethod = false;

		try {
			switch (methodID) {
			case 2:
				gotMethod = true;
				java.lang.String getEndpoint2mtemp = sampleStartWebserviceProxyid
						.getEndpoint();
				if (getEndpoint2mtemp == null) {
	%>
	<%=getEndpoint2mtemp%>
	<%
		} else {
					String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils
							.markup(String.valueOf(getEndpoint2mtemp));
	%>
	<%=tempResultreturnp3%>
	<%
		}
				break;
			case 5:
				gotMethod = true;
				String endpoint_0id = request.getParameter("endpoint8");
				java.lang.String endpoint_0idTemp = null;
				if (!endpoint_0id.equals("")) {
					endpoint_0idTemp = endpoint_0id;
				}
				sampleStartWebserviceProxyid.setEndpoint(endpoint_0idTemp);
				break;
			case 10:
				gotMethod = true;
				net.test.StartWebservice getStartWebservice10mtemp = sampleStartWebserviceProxyid
						.getStartWebservice();
				if (getStartWebservice10mtemp == null) {
	%>
	<%=getStartWebservice10mtemp%>
	<%
		} else {
					if (getStartWebservice10mtemp != null) {
						String tempreturnp11 = getStartWebservice10mtemp
								.toString();
	%>
	<%=tempreturnp11%>
	<%
		}
				}
				break;
			case 13:
				gotMethod = true;
				String msg_1id = request.getParameter("msg16");
				java.lang.String msg_1idTemp = null;
				if (!msg_1id.equals("")) {
					msg_1idTemp = msg_1id;
				}
				java.lang.String getService13mtemp = sampleStartWebserviceProxyid
						.getService(msg_1idTemp);
				if (getService13mtemp == null) {
	%>
	<%=getService13mtemp%>
	<%
		} else {
					String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils
							.markup(String.valueOf(getService13mtemp));
	%>
	<%=tempResultreturnp14%>
	<%
		}
				break;
			}
		} catch (Exception e) {
	%>
	Exception:
	<%=org.eclipse.jst.ws.util.JspUtils.markup(e.toString())%>
	Message:
	<%=org.eclipse.jst.ws.util.JspUtils.markup(e
						.getMessage())%>
	<%
		return;
		}
		if (!gotMethod) {
	%>
	result: N/A
	<%
		}
	%>
</BODY>
</HTML>
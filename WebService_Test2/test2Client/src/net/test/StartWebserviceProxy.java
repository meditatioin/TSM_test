package net.test;

public class StartWebserviceProxy implements net.test.StartWebservice {
	private String _endpoint = null;
	private net.test.StartWebservice startWebservice = null;

	public StartWebserviceProxy() {
		_initStartWebserviceProxy();
	}

	public StartWebserviceProxy(String endpoint) {
		_endpoint = endpoint;
		_initStartWebserviceProxy();
	}

	private void _initStartWebserviceProxy() {
		try {
			startWebservice = (new net.test.StartWebserviceServiceLocator()).getstartWebservice();
			if (startWebservice != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub)startWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)startWebservice)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (startWebservice != null)
			((javax.xml.rpc.Stub)startWebservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public net.test.StartWebservice getStartWebservice() {
		if (startWebservice == null)
			_initStartWebserviceProxy();
		return startWebservice;
	}

	public java.lang.String getService(java.lang.String msg) throws java.rmi.RemoteException{
		if (startWebservice == null)
			_initStartWebserviceProxy();
		return startWebservice.getService(msg);
	}


}
/**
 * StartWebserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.test;

public class StartWebserviceServiceLocator extends org.apache.axis.client.Service implements net.test.StartWebserviceService {

	public StartWebserviceServiceLocator() {
	}


	public StartWebserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public StartWebserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for startWebservice
	private java.lang.String startWebservice_address = "http://localhost:8080/test2/services/startWebservice";

	public java.lang.String getstartWebserviceAddress() {
		return startWebservice_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String startWebserviceWSDDServiceName = "startWebservice";

	public java.lang.String getstartWebserviceWSDDServiceName() {
		return startWebserviceWSDDServiceName;
	}

	public void setstartWebserviceWSDDServiceName(java.lang.String name) {
		startWebserviceWSDDServiceName = name;
	}

	public net.test.StartWebservice getstartWebservice() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(startWebservice_address);
		}
		catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getstartWebservice(endpoint);
	}

	public net.test.StartWebservice getstartWebservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			net.test.StartWebserviceSoapBindingStub _stub = new net.test.StartWebserviceSoapBindingStub(portAddress, this);
			_stub.setPortName(getstartWebserviceWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setstartWebserviceEndpointAddress(java.lang.String address) {
		startWebservice_address = address;
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (net.test.StartWebservice.class.isAssignableFrom(serviceEndpointInterface)) {
				net.test.StartWebserviceSoapBindingStub _stub = new net.test.StartWebserviceSoapBindingStub(new java.net.URL(startWebservice_address), this);
				_stub.setPortName(getstartWebserviceWSDDServiceName());
				return _stub;
			}
		}
		catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface,
	 * then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("startWebservice".equals(inputPortName)) {
			return getstartWebservice();
		}
		else  {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://test.net", "startWebserviceService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://test.net", "startWebservice"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("startWebservice".equals(portName)) {
			setstartWebserviceEndpointAddress(address);
		}
		else 
		{ // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}

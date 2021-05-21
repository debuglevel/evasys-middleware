/**
 * SoapserverLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public class SoapserverLocator extends org.apache.axis.client.Service implements de.debuglevel.evasysmiddleware.soap.Soapserver {

    public SoapserverLocator() {
    }


    public SoapserverLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SoapserverLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for evasysSoapPort
    private java.lang.String evasysSoapPort_address = "https://213.252.154.40/evasys/include/ep/controller/soap/csoapserver.php5";

    public java.lang.String getevasysSoapPortAddress() {
        return evasysSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String evasysSoapPortWSDDServiceName = "evasysSoapPort";

    public java.lang.String getevasysSoapPortWSDDServiceName() {
        return evasysSoapPortWSDDServiceName;
    }

    public void setevasysSoapPortWSDDServiceName(java.lang.String name) {
        evasysSoapPortWSDDServiceName = name;
    }

    public de.debuglevel.evasysmiddleware.soap.EvasysSoapPort_PortType getevasysSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(evasysSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getevasysSoapPort(endpoint);
    }

    public de.debuglevel.evasysmiddleware.soap.EvasysSoapPort_PortType getevasysSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            de.debuglevel.evasysmiddleware.soap.EvasysBindingStub _stub = new de.debuglevel.evasysmiddleware.soap.EvasysBindingStub(portAddress, this);
            _stub.setPortName(getevasysSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setevasysSoapPortEndpointAddress(java.lang.String address) {
        evasysSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (de.debuglevel.evasysmiddleware.soap.EvasysSoapPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                de.debuglevel.evasysmiddleware.soap.EvasysBindingStub _stub = new de.debuglevel.evasysmiddleware.soap.EvasysBindingStub(new java.net.URL(evasysSoapPort_address), this);
                _stub.setPortName(getevasysSoapPortWSDDServiceName());
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
        if ("evasysSoapPort".equals(inputPortName)) {
            return getevasysSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("soapserver.wsdl", "soapserver");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("soapserver.wsdl", "evasysSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("evasysSoapPort".equals(portName)) {
            setevasysSoapPortEndpointAddress(address);
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

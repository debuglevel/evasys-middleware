/**
 * Soapserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.debuglevel.evasysmiddleware.soap;

public interface Soapserver extends javax.xml.rpc.Service {
    java.lang.String getevasysSoapPortAddress();

    de.debuglevel.evasysmiddleware.soap.EvasysSoapPort_PortType getevasysSoapPort() throws javax.xml.rpc.ServiceException;

    de.debuglevel.evasysmiddleware.soap.EvasysSoapPort_PortType getevasysSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

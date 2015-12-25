package com.ilodo.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.lf.lfopen.webservices.domain.workoutresult.json.CardioWorkoutProgress;
import com.lf.lfopen.webservices.domain.workoutresult.json.ResultProgressWorkoutData;

public class ConvertUtils {
//    XMLInputFactory factory = XMLInputFactory.newInstance();  
//    InputStream in = JsonUtils.class.getClassLoader().getResourceAsStream(url);  
//    XMLStreamReader reader = factory.createXMLStreamReader(in); 
	static ObjectMapper objMapper = null;
	static XmlMapper xmlMapper  =null;
	static{ 
		JacksonXmlModule module = new JacksonXmlModule();
	    module.setDefaultUseWrapper(false);
        xmlMapper = new XmlMapper(module);
        objMapper = new ObjectMapper();
     }
    
    //json-->bean
    public static <T> T jsonToBean(String json, Class<T> bean) throws IOException{
         return objMapper.readValue(json, bean);
    }

    //bean-->json
    public static <T> String beanToJson(Object o) throws IOException {
    	return objMapper.writeValueAsString(o);
    }

    //xml-->bean
    public static <T> T xmlStringToBean(String xml, Class<T> cls) throws IOException {
    	return xmlMapper.readValue(xml, cls);
    }

    public static <T> List<T> xmlStringToBeanCollection(String xml, T t) throws IOException {
    	InputStream xmlStream = new ByteArrayInputStream(xml.getBytes());
    	return xmlMapper.readValue(xmlStream, new TypeReference<List<T>>(){});
    }

    public static <T> List<T> xmlStringToBeanCollection(String xml, Class<T> cls) throws IOException {
    	InputStream xmlStream = new ByteArrayInputStream(xml.getBytes());
    	return xmlMapper.readValue(xmlStream, xmlMapper.getTypeFactory().constructCollectionType(List.class, cls));
    }


    //bean-->xml
    public static <T> String beanToXml(T bean) throws JsonProcessingException {
        return objMapper.writeValueAsString(bean);
    }
    
    public static JavaType getCollectionType(ObjectMapper objMapper,Class<?> collectionClass, Class<?>... elementClasses) {     
    	return objMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);     
    }  
    
    //xml-->json
    public static <T> String xmlStringToJson(String xml,Class<T> cls) throws JsonProcessingException,IOException {
    	return beanToJson(xmlStringToBean(xml,cls));
    }

    //json-->xml
    public static <T> String jsonToXml(String json,Class<T> cls) throws JsonProcessingException,IOException {
    	return beanToXml(jsonToBean(json,cls));
    }

    public static <T> T xmlFileToBean(File xmlFile, Class<T> cls) throws IOException {
        T obj = objMapper.readValue(xmlFile, cls);
        return obj;
    }

    
    public static <T> T xmlStreamToBean(InputStream xmlInputStream, Class<T> cls) throws IOException {
        return objMapper.readValue(xmlInputStream, cls);
    }

}
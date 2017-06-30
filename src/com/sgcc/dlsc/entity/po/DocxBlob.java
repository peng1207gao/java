package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * DocxBlob的POJO类
 *
 * @author  sss  [Mon Nov 18 09:40:02 CST 2013]
 * 
 */
public class DocxBlob implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性docid
     */
    private String docid;
	
    /** 
     * 属性doccontent
     */
    private byte[] doccontent;
	
    /** 
     * 属性bak1
     */
    private String bak1;
	
    /** 
     * 属性bak2
     */
    private String bak2;
	
    /** 
     * 属性bak3
     */
    private String bak3;
	
    /**
     * DocxBlob构造函数
     */
    public DocxBlob() {
        super();
    }  
	
    /**
     * DocxBlob完整的构造函数
     */  
    public DocxBlob(String guid,String docid){
        this.guid = guid;
        this.docid = docid;
    }
 
	
	
    /**
     * 属性 guid 的get方法
     * @return String
     */
    public String getGuid(){
        return guid;
    }
	
    /**
     * 属性 guid 的set方法
     * @return
     */
    public void setGuid(String guid){
        if(guid != null && guid.trim().length() == 0){
            this.guid = null;
        }else{
            this.guid = guid;
        }
    } 
	
	
	
    /**
     * 属性 docid 的get方法
     * @return String
     */
    public String getDocid(){
        return docid;
    }
	
    /**
     * 属性 docid 的set方法
     * @return
     */
    public void setDocid(String docid){
        this.docid = docid;
    } 
	
	
	
    /**
     * 属性 doccontent 的get方法
     * @return byte[]
     */
    public byte[] getDoccontent(){
        return doccontent;
    }
	
    /**
     * 属性 doccontent 的set方法
     * @return
     */
    public void setDoccontent(byte[] doccontent){
        this.doccontent = doccontent;
    } 
	
	
	
    /**
     * 属性 bak1 的get方法
     * @return String
     */
    public String getBak1(){
        return bak1;
    }
	
    /**
     * 属性 bak1 的set方法
     * @return
     */
    public void setBak1(String bak1){
        this.bak1 = bak1;
    } 
	
	
	
    /**
     * 属性 bak2 的get方法
     * @return String
     */
    public String getBak2(){
        return bak2;
    }
	
    /**
     * 属性 bak2 的set方法
     * @return
     */
    public void setBak2(String bak2){
        this.bak2 = bak2;
    } 
	
	
	
    /**
     * 属性 bak3 的get方法
     * @return String
     */
    public String getBak3(){
        return bak3;
    }
	
    /**
     * 属性 bak3 的set方法
     * @return
     */
    public void setBak3(String bak3){
        this.bak3 = bak3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof DocxBlob))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        DocxBlob other = (DocxBlob) o;	        
	    return new EqualsBuilder()
            .append(this.getGuid(), other.getGuid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("docid"+":"+getDocid())
            .append("doccontent"+":"+getDoccontent())
            .append("bak1"+":"+getBak1())
            .append("bak2"+":"+getBak2())
            .append("bak3"+":"+getBak3())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

}
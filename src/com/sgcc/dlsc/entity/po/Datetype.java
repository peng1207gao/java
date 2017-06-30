package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * Datetype的POJO类
 *
 * @author  sss  [Wed Nov 20 14:21:26 CST 2013]
 * 
 */
public class Datetype implements Serializable{

    /** 
     * 属性sdate
     */
    private String sdate;
	
    /** 
     * 属性stype
     */
    private String stype;
	
    /**
     * Datetype构造函数
     */
    public Datetype() {
        super();
    }  
	
    /**
     * Datetype完整的构造函数
     */  
    public Datetype(String sdate,String stype){
        this.sdate = sdate;
        this.stype = stype;
    }
 
	
	
    /**
     * 属性 sdate 的get方法
     * @return String
     */
    public String getSdate(){
        return sdate;
    }
	
    /**
     * 属性 sdate 的set方法
     * @return
     */
    public void setSdate(String sdate){
        if(sdate != null && sdate.trim().length() == 0){
            this.sdate = null;
        }else{
            this.sdate = sdate;
        }
    } 
	
	
	
    /**
     * 属性 stype 的get方法
     * @return String
     */
    public String getStype(){
        return stype;
    }
	
    /**
     * 属性 stype 的set方法
     * @return
     */
    public void setStype(String stype){
        this.stype = stype;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof Datetype))
	        return false; 
			
        if(getSdate() == null) 
	        return false;

        Datetype other = (Datetype) o;	        
	    return new EqualsBuilder()
            .append(this.getSdate(), other.getSdate())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sdate"+":"+getSdate())
            .append("stype"+":"+getStype())
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
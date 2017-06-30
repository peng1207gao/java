package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaGencode的POJO类
 *
 * @author  Administrator  [Fri Jul 12 09:31:35 CST 2013]
 * 
 */
public class BaGencode implements Serializable{

    /**
	 * @description 
	 */
	private static final long serialVersionUID = 1L;

	/** 
     * 属性gencodeid
     */
    private String gencodeid;
	
    /** 
     * 属性value
     */
    private String value;
	
    /** 
     * 属性name
     */
    private String name;
	
    /** 
     * 属性type
     */
    private String type;
	
    /** 
     * 属性parentid
     */
    private String parentid;
	
    /** 
     * 属性gdesc
     */
    private String gdesc;
	
    /**
     * BaGencode构造函数
     */
    public BaGencode() {
        super();
    }  
	
    /**
     * BaGencode完整的构造函数
     */  
    public BaGencode(String gencodeid){
        this.gencodeid = gencodeid;
    }
 
    /**
     * 属性 gencodeid 的get方法
     * @return String
     */
    public String getGencodeid(){
        return gencodeid;
    }
	
    /**
     * 属性 gencodeid 的set方法
     * @return
     */
    public void setGencodeid(String gencodeid){
        if(gencodeid != null && gencodeid.trim().length() == 0){
            this.gencodeid = null;
        }else{
            this.gencodeid = gencodeid;
        }
    } 
	
    /**
     * 属性 value 的get方法
     * @return String
     */
    public String getValue(){
        return value;
    }
	
    /**
     * 属性 value 的set方法
     * @return
     */
    public void setValue(String value){
        this.value = value;
    } 
	
    /**
     * 属性 name 的get方法
     * @return String
     */
    public String getName(){
        return name;
    }
	
    /**
     * 属性 name 的set方法
     * @return
     */
    public void setName(String name){
        this.name = name;
    } 
	
    /**
     * 属性 type 的get方法
     * @return String
     */
    public String getType(){
        return type;
    }
	
    /**
     * 属性 type 的set方法
     * @return
     */
    public void setType(String type){
        this.type = type;
    } 
	
    /**
     * 属性 parentid 的get方法
     * @return String
     */
    public String getParentid(){
        return parentid;
    }
	
    /**
     * 属性 parentid 的set方法
     * @return
     */
    public void setParentid(String parentid){
        this.parentid = parentid;
    } 
	
    /**
     * 属性 gdesc 的get方法
     * @return String
     */
    public String getGdesc(){
        return gdesc;
    }
	
    /**
     * 属性 gdesc 的set方法
     * @return
     */
    public void setGdesc(String gdesc){
        this.gdesc = gdesc;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaGencode))
	        return false; 
			
        if(getGencodeid() == null) 
	        return false;

        BaGencode other = (BaGencode) o;	        
	    return new EqualsBuilder()
            .append(this.getGencodeid(), other.getGencodeid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("gencodeid"+":"+getGencodeid())
            .append("value"+":"+getValue())
            .append("name"+":"+getName())
            .append("type"+":"+getType())
            .append("parentid"+":"+getParentid())
            .append("gdesc"+":"+getGdesc())
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
package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * IrFuctionnode的POJO类
 *
 * @author  toshiba  [Wed Aug 14 16:37:09 CST 2013]
 * 
 */
public class IrFuctionnode implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性itemid
     */
    private String itemid;
	
    /** 
     * 属性itemname
     */
    private String itemname;
	
    /** 
     * 属性fatheritemid
     */
    private String fatheritemid;
	
    /** 
     * 属性fatheritemname
     */
    private String fatheritemname;
	
    /** 
     * 属性isvalid
     */
    private String isvalid;
	
    /**
     * IrFuctionnode构造函数
     */
    public IrFuctionnode() {
        super();
    }  
	
    /**
     * IrFuctionnode完整的构造函数
     */  
    public IrFuctionnode(String itemid){
        this.itemid = itemid;
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
        this.guid = guid;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 itemid 的get方法
     * @return String
     */
    public String getItemid(){
        return itemid;
    }
	
    /**
     * 属性 itemid 的set方法
     * @return
     */
    public void setItemid(String itemid){
        if(itemid != null && itemid.trim().length() == 0){
            this.itemid = null;
        }else{
            this.itemid = itemid;
        }
    } 
	
    /**
     * 属性 itemname 的get方法
     * @return String
     */
    public String getItemname(){
        return itemname;
    }
	
    /**
     * 属性 itemname 的set方法
     * @return
     */
    public void setItemname(String itemname){
        this.itemname = itemname;
    } 
	
    /**
     * 属性 fatheritemid 的get方法
     * @return String
     */
    public String getFatheritemid(){
        return fatheritemid;
    }
	
    /**
     * 属性 fatheritemid 的set方法
     * @return
     */
    public void setFatheritemid(String fatheritemid){
        this.fatheritemid = fatheritemid;
    } 
	
    /**
     * 属性 fatheritemname 的get方法
     * @return String
     */
    public String getFatheritemname(){
        return fatheritemname;
    }
	
    /**
     * 属性 fatheritemname 的set方法
     * @return
     */
    public void setFatheritemname(String fatheritemname){
        this.fatheritemname = fatheritemname;
    } 
	
    /**
     * 属性 isvalid 的get方法
     * @return String
     */
    public String getIsvalid(){
        return isvalid;
    }
	
    /**
     * 属性 isvalid 的set方法
     * @return
     */
    public void setIsvalid(String isvalid){
        this.isvalid = isvalid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof IrFuctionnode))
	        return false; 
			
        if(getItemid() == null) 
	        return false;

        IrFuctionnode other = (IrFuctionnode) o;	        
	    return new EqualsBuilder()
            .append(this.getItemid(), other.getItemid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("guid"+":"+getGuid())
            .append("marketid"+":"+getMarketid())
            .append("itemid"+":"+getItemid())
            .append("itemname"+":"+getItemname())
            .append("fatheritemid"+":"+getFatheritemid())
            .append("fatheritemname"+":"+getFatheritemname())
            .append("isvalid"+":"+getIsvalid())
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
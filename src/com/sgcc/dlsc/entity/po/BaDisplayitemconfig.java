package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaDisplayitemconfig的POJO类
 *
 * @author  Administrator  [Tue Jan 21 17:29:19 CST 2014]
 * 
 */
public class BaDisplayitemconfig implements Serializable{

    /** 
     * 属性sheetid
     */
    private String sheetid;
	
    /** 
     * 属性pageId
     */
    private String pageId;
	
    /** 
     * 属性pageName
     */
    private String pageName;
	
    /** 
     * 属性itemType
     */
    private BigDecimal itemType;
	
    /** 
     * 属性itemFieldId
     */
    private String itemFieldId;
	
    /** 
     * 属性itemFieldName
     */
    private String itemFieldName;
	
    /** 
     * 属性isDispaly
     */
    private BigDecimal isDispaly;
	
    /** 
     * 属性itemDisplayName
     */
    private String itemDisplayName;
	
    /** 
     * 属性code
     */
    private String code;
	
    /** 
     * 属性dataButton
     */
    private String dataButton;
	
    /** 
     * 属性dataUrl
     */
    private String dataUrl;
	
    /** 
     * 属性dataSelect
     */
    private String dataSelect;
	
    /** 
     * 属性orderby
     */
    private BigDecimal orderby;
	
    /** 
     * 属性isRequiredDisplay
     */
    private BigDecimal isRequiredDisplay;
	
    /** 
     * 属性isRequired
     */
    private BigDecimal isRequired;
	
    /** 
     * 属性dataValidation
     */
    private String dataValidation;
	
    /**
     * BaDisplayitemconfig构造函数
     */
    public BaDisplayitemconfig() {
        super();
    }  
	
    /**
     * BaDisplayitemconfig完整的构造函数
     */  
    public BaDisplayitemconfig(String sheetid){
        this.sheetid = sheetid;
    }
 
    /**
     * 属性 sheetid 的get方法
     * @return String
     */
    public String getSheetid(){
        return sheetid;
    }
	
    /**
     * 属性 sheetid 的set方法
     * @return
     */
    public void setSheetid(String sheetid){
        if(sheetid != null && sheetid.trim().length() == 0){
            this.sheetid = null;
        }else{
            this.sheetid = sheetid;
        }
    } 
	
    /**
     * 属性 pageId 的get方法
     * @return String
     */
    public String getPageId(){
        return pageId;
    }
	
    /**
     * 属性 pageId 的set方法
     * @return
     */
    public void setPageId(String pageId){
        this.pageId = pageId;
    } 
	
    /**
     * 属性 pageName 的get方法
     * @return String
     */
    public String getPageName(){
        return pageName;
    }
	
    /**
     * 属性 pageName 的set方法
     * @return
     */
    public void setPageName(String pageName){
        this.pageName = pageName;
    } 
	
    /**
     * 属性 itemType 的get方法
     * @return BigDecimal
     */
    public BigDecimal getItemType(){
        return itemType;
    }
	
    /**
     * 属性 itemType 的set方法
     * @return
     */
    public void setItemType(BigDecimal itemType){
        this.itemType = itemType;
    } 
	
    /**
     * 属性 itemFieldId 的get方法
     * @return String
     */
    public String getItemFieldId(){
        return itemFieldId;
    }
	
    /**
     * 属性 itemFieldId 的set方法
     * @return
     */
    public void setItemFieldId(String itemFieldId){
        this.itemFieldId = itemFieldId;
    } 
	
    /**
     * 属性 itemFieldName 的get方法
     * @return String
     */
    public String getItemFieldName(){
        return itemFieldName;
    }
	
    /**
     * 属性 itemFieldName 的set方法
     * @return
     */
    public void setItemFieldName(String itemFieldName){
        this.itemFieldName = itemFieldName;
    } 
	
    /**
     * 属性 isDispaly 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsDispaly(){
        return isDispaly;
    }
	
    /**
     * 属性 isDispaly 的set方法
     * @return
     */
    public void setIsDispaly(BigDecimal isDispaly){
        this.isDispaly = isDispaly;
    } 
	
    /**
     * 属性 itemDisplayName 的get方法
     * @return String
     */
    public String getItemDisplayName(){
        return itemDisplayName;
    }
	
    /**
     * 属性 itemDisplayName 的set方法
     * @return
     */
    public void setItemDisplayName(String itemDisplayName){
        this.itemDisplayName = itemDisplayName;
    } 
	
    /**
     * 属性 code 的get方法
     * @return String
     */
    public String getCode(){
        return code;
    }
	
    /**
     * 属性 code 的set方法
     * @return
     */
    public void setCode(String code){
        this.code = code;
    } 
	
    /**
     * 属性 dataButton 的get方法
     * @return String
     */
    public String getDataButton(){
        return dataButton;
    }
	
    /**
     * 属性 dataButton 的set方法
     * @return
     */
    public void setDataButton(String dataButton){
        this.dataButton = dataButton;
    } 
	
    /**
     * 属性 dataUrl 的get方法
     * @return String
     */
    public String getDataUrl(){
        return dataUrl;
    }
	
    /**
     * 属性 dataUrl 的set方法
     * @return
     */
    public void setDataUrl(String dataUrl){
        this.dataUrl = dataUrl;
    } 
	
    /**
     * 属性 dataSelect 的get方法
     * @return String
     */
    public String getDataSelect(){
        return dataSelect;
    }
	
    /**
     * 属性 dataSelect 的set方法
     * @return
     */
    public void setDataSelect(String dataSelect){
        this.dataSelect = dataSelect;
    } 
	
    /**
     * 属性 orderby 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderby(){
        return orderby;
    }
	
    /**
     * 属性 orderby 的set方法
     * @return
     */
    public void setOrderby(BigDecimal orderby){
        this.orderby = orderby;
    } 
	
    /**
     * 属性 isRequiredDisplay 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsRequiredDisplay(){
        return isRequiredDisplay;
    }
	
    /**
     * 属性 isRequiredDisplay 的set方法
     * @return
     */
    public void setIsRequiredDisplay(BigDecimal isRequiredDisplay){
        this.isRequiredDisplay = isRequiredDisplay;
    } 
	
    /**
     * 属性 isRequired 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIsRequired(){
        return isRequired;
    }
	
    /**
     * 属性 isRequired 的set方法
     * @return
     */
    public void setIsRequired(BigDecimal isRequired){
        this.isRequired = isRequired;
    } 
	
    /**
     * 属性 dataValidation 的get方法
     * @return String
     */
    public String getDataValidation(){
        return dataValidation;
    }
	
    /**
     * 属性 dataValidation 的set方法
     * @return
     */
    public void setDataValidation(String dataValidation){
        this.dataValidation = dataValidation;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaDisplayitemconfig))
	        return false; 
			
        if(getSheetid() == null) 
	        return false;

        BaDisplayitemconfig other = (BaDisplayitemconfig) o;	        
	    return new EqualsBuilder()
            .append(this.getSheetid(), other.getSheetid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sheetid"+":"+getSheetid())
            .append("pageId"+":"+getPageId())
            .append("pageName"+":"+getPageName())
            .append("itemType"+":"+getItemType())
            .append("itemFieldId"+":"+getItemFieldId())
            .append("itemFieldName"+":"+getItemFieldName())
            .append("isDispaly"+":"+getIsDispaly())
            .append("itemDisplayName"+":"+getItemDisplayName())
            .append("code"+":"+getCode())
            .append("dataButton"+":"+getDataButton())
            .append("dataUrl"+":"+getDataUrl())
            .append("dataSelect"+":"+getDataSelect())
            .append("orderby"+":"+getOrderby())
            .append("isRequiredDisplay"+":"+getIsRequiredDisplay())
            .append("isRequired"+":"+getIsRequired())
            .append("dataValidation"+":"+getDataValidation())
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
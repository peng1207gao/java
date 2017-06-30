package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * TrTradeReviewNode的POJO类
 *
 * @author  Administrator  [Tue Feb 11 19:30:17 CST 2014]
 * 
 */
public class TrTradeReviewNode implements Serializable{

    /** 
     * 属性guid
     */
    private String guid;
	
    /** 
     * 属性tradeseqId
     */
    private BigDecimal tradeseqId;
	
    /** 
     * 属性infotype
     */
    private String infotype;
	
    /** 
     * 属性reviewnum
     */
    private String reviewnum;
	
    /** 
     * 属性nodenum
     */
    private String nodenum;
	
    /** 
     * 属性reviewresult
     */
    private BigDecimal reviewresult;
	
    /** 
     * 属性reviewinfo
     */
    private String reviewinfo;
	
    /** 
     * 属性issendmsg
     */
    private BigDecimal issendmsg;
	
    /** 
     * 属性reviewpersion
     */
    private String reviewpersion;
	
    /** 
     * 属性reviewtime
     */
    private Date reviewtime;
	
    /** 
     * 属性marketId
     */
    private String marketId;
    
    /** 
     * 属性nodeName
     */
    private String nodeName;
	
    public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	/**
     * TrTradeReviewNode构造函数
     */
    public TrTradeReviewNode() {
        super();
    }  
	
    /**
     * TrTradeReviewNode完整的构造函数
     */  
    public TrTradeReviewNode(String guid){
        this.guid = guid;
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
     * 属性 tradeseqId 的get方法
     * @return BigDecimal
     */
    public BigDecimal getTradeseqId(){
        return tradeseqId;
    }
	
    /**
     * 属性 tradeseqId 的set方法
     * @return
     */
    public void setTradeseqId(BigDecimal tradeseqId){
        this.tradeseqId = tradeseqId;
    } 
	
    /**
     * 属性 infotype 的get方法
     * @return String
     */
    public String getInfotype(){
        return infotype;
    }
	
    /**
     * 属性 infotype 的set方法
     * @return
     */
    public void setInfotype(String infotype){
        this.infotype = infotype;
    } 
	
    /**
     * 属性 reviewnum 的get方法
     * @return String
     */
    public String getReviewnum(){
        return reviewnum;
    }
	
    /**
     * 属性 reviewnum 的set方法
     * @return
     */
    public void setReviewnum(String reviewnum){
        this.reviewnum = reviewnum;
    } 
	
    /**
     * 属性 nodenum 的get方法
     * @return String
     */
    public String getNodenum(){
        return nodenum;
    }
	
    /**
     * 属性 nodenum 的set方法
     * @return
     */
    public void setNodenum(String nodenum){
        this.nodenum = nodenum;
    } 
	
    /**
     * 属性 reviewresult 的get方法
     * @return BigDecimal
     */
    public BigDecimal getReviewresult(){
        return reviewresult;
    }
	
    /**
     * 属性 reviewresult 的set方法
     * @return
     */
    public void setReviewresult(BigDecimal reviewresult){
        this.reviewresult = reviewresult;
    } 
	
    /**
     * 属性 reviewinfo 的get方法
     * @return String
     */
    public String getReviewinfo(){
        return reviewinfo;
    }
	
    /**
     * 属性 reviewinfo 的set方法
     * @return
     */
    public void setReviewinfo(String reviewinfo){
        this.reviewinfo = reviewinfo;
    } 
	
    /**
     * 属性 issendmsg 的get方法
     * @return BigDecimal
     */
    public BigDecimal getIssendmsg(){
        return issendmsg;
    }
	
    /**
     * 属性 issendmsg 的set方法
     * @return
     */
    public void setIssendmsg(BigDecimal issendmsg){
        this.issendmsg = issendmsg;
    } 
	
    /**
     * 属性 reviewpersion 的get方法
     * @return String
     */
    public String getReviewpersion(){
        return reviewpersion;
    }
	
    /**
     * 属性 reviewpersion 的set方法
     * @return
     */
    public void setReviewpersion(String reviewpersion){
        this.reviewpersion = reviewpersion;
    } 
	
    /**
     * 属性 reviewtime 的get方法
     * @return Date
     */
    public Date getReviewtime(){
        return reviewtime;
    }
	
    /**
     * 属性 reviewtime 的set方法
     * @return
     */
    public void setReviewtime(Date reviewtime){
        this.reviewtime = reviewtime;
    } 
	
    /**
     * 属性 marketId 的get方法
     * @return String
     */
    public String getMarketId(){
        return marketId;
    }
	
    /**
     * 属性 marketId 的set方法
     * @return
     */
    public void setMarketId(String marketId){
        this.marketId = marketId;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof TrTradeReviewNode))
	        return false; 
			
        if(getGuid() == null) 
	        return false;

        TrTradeReviewNode other = (TrTradeReviewNode) o;	        
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
            .append("tradeseqId"+":"+getTradeseqId())
            .append("infotype"+":"+getInfotype())
            .append("reviewnum"+":"+getReviewnum())
            .append("nodenum"+":"+getNodenum())
            .append("reviewresult"+":"+getReviewresult())
            .append("reviewinfo"+":"+getReviewinfo())
            .append("issendmsg"+":"+getIssendmsg())
            .append("reviewpersion"+":"+getReviewpersion())
            .append("reviewtime"+":"+getReviewtime())
            .append("marketId"+":"+getMarketId())
            .append("nodeName"+":"+getNodeName())
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
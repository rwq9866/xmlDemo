package com.muyou.xmlDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 杆塔信息实体类
 * 
 * @author 李坤
 *
 */
@Entity
@Table(name = "GIS_TOWER")
public class Tower {
	// 主键
	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	private String id;
	
	// 线路ID
	@Column(name = "LINEID", length = 36)
	private String lineId;
	
	// 排序号
	@Column(name = "TORDER")
	private Integer torder;

	// 名称
	@Column(name = "NAME", length = 50)
	private String name;

	// 经度
	@Column(name = "LONGITUDE")
	private Double longitude;
	
	// 纬度
	@Column(name = "LATITUDE")
	private Double latitude;

	// 是否起始
	@Column(name = "ISBEGIN", length = 50)
	private String isbegin;

	// 标签样式
	@Column(name = "TAGSTYLE", length = 50)
	private String tagstyle;

	// 描述
	@Column(name = "REMARK", length = 255)
	private String remark;

	// 图标
	@Column(name = "ICON", length = 255)
	private String icon;
	
	// 添加时间
	@Column(name = "ADDTIME", updatable = false)
	private Long addtime;

	// 修改时间
	@Column(name = "UPDATETIME")
	private Long updatetime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public Integer getTorder() {
		return torder;
	}

	public void setTorder(Integer torder) {
		this.torder = torder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getIsbegin() {
		return isbegin;
	}

	public void setIsbegin(String isbegin) {
		this.isbegin = isbegin;
	}

	public String getTagstyle() {
		return tagstyle;
	}

	public void setTagstyle(String tagstyle) {
		this.tagstyle = tagstyle;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getAddtime() {
		return addtime;
	}

	public void setAddtime(Long addtime) {
		this.addtime = addtime;
	}

	public Long getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Long updatetime) {
		this.updatetime = updatetime;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "Tower [torder=" + torder + ", name=" + name + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", isbegin=" + isbegin + ", tagstyle=" + tagstyle + ", remark=" + remark + ", icon=" + icon + "]";
	}

	

	public Tower(String lineId, Integer torder, String name, Double longitude, Double latitude, String isbegin,
			String tagstyle, String remark, String icon, Long addtime) {
		super();
		this.lineId = lineId;
		this.torder = torder;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
		this.isbegin = isbegin;
		this.tagstyle = tagstyle;
		this.remark = remark;
		this.icon = icon;
		this.addtime = addtime;
	}

	public Tower() {
		super();
	}
	
	
	
}

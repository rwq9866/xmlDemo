package com.muyou.xmlDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 线路信息实体类
 * 
 * @author 李坤
 *
 */
@Entity
@Table(name = "GIS_LINE")
public class Line {
	// 主键
	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Column(name = "ID", unique = true, nullable = false, length = 36)
	private String id;

	// 名称
	@Column(name = "NAME", length = 50)
	private String name;


	// 是否启用 （参照 StatusEnum）
	@Column(name = "STATUS", length = 2)
	private String status;
	
	// 起点经度
	@Column(name = "LONGITUDE")
	private Double startLongitude;
	
	// 起点维度
	@Column(name = "LATITUDE")
	private Double startLatitude;

	// 备注说明
	@Column(name = "REMARK", length = 255)
	private String remark;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(Double startLongitude) {
		this.startLongitude = startLongitude;
	}

	public Double getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(Double startLatitude) {
		this.startLatitude = startLatitude;
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

	public Line(String id, String name, String status, Double startLongitude, Double startLatitude, String remark,
			Long addtime, Long updatetime) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.startLongitude = startLongitude;
		this.startLatitude = startLatitude;
		this.remark = remark;
		this.addtime = addtime;
		this.updatetime = updatetime;
	}

	public Line() {
		super();
	}

	@Override
	public String toString() {
		return "Line [id=" + id + ", name=" + name + ", status=" + status + ", startLongitude=" + startLongitude
				+ ", startLatitude=" + startLatitude + ", remark=" + remark + ", addtime=" + addtime + ", updatetime="
				+ updatetime + "]";
	}
	
	
}

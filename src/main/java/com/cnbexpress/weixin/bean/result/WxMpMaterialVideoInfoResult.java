package com.cnbexpress.weixin.bean.result;

import com.cnbexpress.weixin.util.json.WxMpGsonBuilder;

import java.io.Serializable;

public class WxMpMaterialVideoInfoResult implements Serializable {
	private static final long serialVersionUID = 7636563010273628414L;

	private String title;
	private String description;
	private String downUrl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDownUrl() {
		return downUrl;
	}

	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}

	public static WxMpMaterialVideoInfoResult fromJson(String json) {
		return WxMpGsonBuilder.create().fromJson(json, WxMpMaterialVideoInfoResult.class);
	}

	@Override
	public String toString() {
		return "WxMpMaterialVideoInfoResult [title=" + title + ", description=" + description + ", downUrl=" + downUrl
				+ "]";
	}

}

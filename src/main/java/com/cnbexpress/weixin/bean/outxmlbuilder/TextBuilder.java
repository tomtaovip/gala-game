package com.cnbexpress.weixin.bean.outxmlbuilder;

import com.cnbexpress.weixin.bean.WxMpXmlOutTextMessage;

/**
 * 文本消息builder
 * @author tom.tao
 *
 */
public final class TextBuilder extends BaseBuilder<TextBuilder, WxMpXmlOutTextMessage> {
  private String content;

  public TextBuilder content(String content) {
    this.content = content;
    return this;
  }

  public WxMpXmlOutTextMessage build() {
    WxMpXmlOutTextMessage m = new WxMpXmlOutTextMessage();
    setCommon(m);
    m.setContent(this.content);
    return m;
  }
}

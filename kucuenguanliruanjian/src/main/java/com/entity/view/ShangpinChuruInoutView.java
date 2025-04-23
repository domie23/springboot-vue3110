package com.entity.view;

import com.entity.ShangpinChuruInoutEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入库
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpin_churu_inout")
public class ShangpinChuruInoutView extends ShangpinChuruInoutEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 出入库类型的值
		*/
		private String shangpinChuruInoutValue;



		//级联表 kehu
			/**
			* 客户姓名
			*/
			private String kehuName;
			/**
			* 头像
			*/
			private String kehuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 联系方式
			*/
			private String kehuPhone;
			/**
			* 邮箱
			*/
			private String kehuEmail;

	public ShangpinChuruInoutView() {

	}

	public ShangpinChuruInoutView(ShangpinChuruInoutEntity shangpinChuruInoutEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinChuruInoutEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 出入库类型的值
			*/
			public String getShangpinChuruInoutValue() {
				return shangpinChuruInoutValue;
			}
			/**
			* 设置： 出入库类型的值
			*/
			public void setShangpinChuruInoutValue(String shangpinChuruInoutValue) {
				this.shangpinChuruInoutValue = shangpinChuruInoutValue;
			}






				//级联表的get和set kehu

					/**
					* 获取： 客户姓名
					*/
					public String getKehuName() {
						return kehuName;
					}
					/**
					* 设置： 客户姓名
					*/
					public void setKehuName(String kehuName) {
						this.kehuName = kehuName;
					}

					/**
					* 获取： 头像
					*/
					public String getKehuPhoto() {
						return kehuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setKehuPhoto(String kehuPhoto) {
						this.kehuPhoto = kehuPhoto;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 联系方式
					*/
					public String getKehuPhone() {
						return kehuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setKehuPhone(String kehuPhone) {
						this.kehuPhone = kehuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getKehuEmail() {
						return kehuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setKehuEmail(String kehuEmail) {
						this.kehuEmail = kehuEmail;
					}












}

package net.ui.model.validate;

/**
 * �ṩУ�����ӿ�
 * @author qilin
 *
 */
public interface ValidateService {
	
	/**
	 * У��
	 * @param aFormKey   �?ID
	 * @param aBean      ��У��Ķ���
	 * @return ������Ϣ 
	 * @throws Exception
	 */
	public ErrorMessages validator(String aFormKey, Object aBean) throws Exception;
}

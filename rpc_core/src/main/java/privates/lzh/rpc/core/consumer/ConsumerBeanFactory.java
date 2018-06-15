package privates.lzh.rpc.core.consumer;

import java.lang.reflect.InvocationHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import privates.lzh.rpc.core.proxy.ConsumerInterfaceProxyUtil;
import privates.lzh.rpc.core.proxy.ConsumerInvokeHandler;

/****
 * 生成 RPC 接口代理bean
 * @author LZH
 *
 */
public class ConsumerBeanFactory implements FactoryBean<Object> 
{
	private final Logger log = LoggerFactory.getLogger(ConsumerRPCManager.class);
	private Class<?> clazz;
	private InvocationHandler handler = new ConsumerInvokeHandler();
	
	public Object getObject() throws Exception 
	{
		log.debug("clazz is " + clazz);
		ClassLoader loader = this.getClass().getClassLoader();
		return ConsumerInterfaceProxyUtil.newProxyInstance(loader, clazz, handler);
	}

	public Class<?> getObjectType() 
	{
		return clazz;
	}

	public boolean isSingleton() 
	{
		return true;
	}

	public Class<?> getClazz() 
	{
		return clazz;
	}

	public void setClazz(Class<?> clazz) 
	{
		this.clazz = clazz;
	}
}

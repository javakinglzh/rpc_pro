package privates.lzh.rpc.core.consumer;

import org.springframework.beans.factory.FactoryBean;

public class ConsumerBeanFactory implements FactoryBean<Object> 
{

	public Object getObject() throws Exception 
	{
		return null;
	}

	public Class<?> getObjectType() {
		return null;
	}

	public boolean isSingleton() 
	{
		return true;
	}

}

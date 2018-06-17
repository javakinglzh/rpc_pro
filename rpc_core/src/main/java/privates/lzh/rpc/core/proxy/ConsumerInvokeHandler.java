package privates.lzh.rpc.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import privates.lzh.rpc.core.consumer.ConsumerRPCManager;

/***
 * consumer接口动态代理
 * @author LZH
 *
 */
public class ConsumerInvokeHandler implements InvocationHandler 
{
	private final Logger log = LoggerFactory.getLogger(ConsumerInvokeHandler.class);
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		log.debug("this is an invocation handler");
		return null;
	}

}

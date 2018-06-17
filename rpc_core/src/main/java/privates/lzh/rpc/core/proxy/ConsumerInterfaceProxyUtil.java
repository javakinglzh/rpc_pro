package privates.lzh.rpc.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import privates.lzh.rpc.core.exception.RPCException;

/***
 * 为consumer接口生成代理
 * @author LZH
 *
 */
public class ConsumerInterfaceProxyUtil 
{
	public static Object newProxyInstance(ClassLoader loader, Class<?> clazz, InvocationHandler h)throws Exception
	{
		boolean isInterface = isInterface(clazz);
		if(!isInterface)
		{
			throw new RPCException(clazz.toString() + "is not a interface, can not generate a proxy class");
		}
		Object obj = Proxy.newProxyInstance(loader, new Class[]{clazz}, h);
		return obj;
	}
	
	/**
	 * judge the given clazz is a interface or not
	 * @param clazz
	 * @return true RPC interface
	 */
	private static boolean isInterface(Class<?> clazz)
	{
		boolean isInterface = false;
		if(clazz.isInterface())
			isInterface = true;
		return isInterface;
	}
}

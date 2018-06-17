package privates.lzh.rpc.core.exception;

/***
 * RPC exception
 * @author LZH
 *
 */
public class RPCException extends RuntimeException 
{
	private static final long serialVersionUID = 111112L;

	public RPCException(String message)
	{
		super(message);
	}
}

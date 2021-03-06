package privates.lzh.rpc.web.consumer.common;

public class ServerResponse<D>
{
    // 返回码 0成功, 默认成功
    private int id;
    
    // 描述
    private String desc;

    // 返回数据
    private D data;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public D getData()
    {
        return data;
    }

    public void setData(D data)
    {
        this.data = data;
    }
}

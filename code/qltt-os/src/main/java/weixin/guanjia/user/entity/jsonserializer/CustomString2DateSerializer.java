package weixin.guanjia.user.entity.jsonserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
/**
 * @ClassName:     CustomDateSerializer.java 
 * @Description:   转化JSon的时候，将日期格式转为"yyyy-MM-dd HH:mm:ss
 */
public class CustomString2DateSerializer extends JsonSerializer<String>
{
    public void serialize(String longtime, JsonGenerator gen, SerializerProvider provider)throws IOException, JsonProcessingException
    {
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = format.format(new Date(Long.parseLong(longtime)));
        gen.writeString(formattedDate);
    }
}

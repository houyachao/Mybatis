package hyc.test;

import hyc.entity.MdcAmzExcelConfig;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * 类<code>$</code>说明：
 *
 * @author houyachao
 * @email houyachao@mabangerp.com
 * @since $
 */
public class TestMain {
    public static void main(String[] args) {
        String resource = "hyc/test/mybatis-config.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                List<MdcAmzExcelConfig> objects = session.selectList("hyc.mapper.MdcAmzExcelConfigMapper.getExcelConfig");
                System.out.println();
            } finally {
                session.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

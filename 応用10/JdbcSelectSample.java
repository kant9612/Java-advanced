package ouyou10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcSelectSample {
	private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            // com.mysql.cj.jdbc.Driverクラスをロードして、初期化処理を行う
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            // ドライバのクラスがクラスパスに見つからなかった場合にClassNotFoundExceptionが発生します。
            e.printStackTrace();
            // ドライバが見つからない場合は、後続の処理を続行できませんので、例外をthrowして処理を中断します。
            throw e;
        }

        // Connection（データベースとの接続を表す）、PreparedStatement（発行するSQLを表す）を、それぞれ生成します。
        try (Connection connection = DriverManager.getConnection(URL);
                PreparedStatement statement = connection.prepareStatement("insert into user (email, name) values (?, ?)")) {

            boolean result = statement.execute();

            statement.setString(1, "bbb@bbb.bbb");
            statement.setString(2, "山田三郎");
            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

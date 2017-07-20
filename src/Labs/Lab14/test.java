package Labs.Lab14;

import Labs.Lab14.Singleton.ProgramConfiguration;

import java.util.PropertyPermission;

/*
Aaron Board
 */
public class test {
    public static void main(String[] args) {
        ProgramConfiguration.getInstance().setConnectionLimit(1000);
        ProgramConfiguration.getInstance().setPortNumber(3080);
        ProgramConfiguration.getInstance().setTimeout(500);
        ProgramConfiguration.getInstance().setURL("bomb.com");

        System.out.println(ProgramConfiguration.getInstance().getConnectionLimit());
        System.out.println(ProgramConfiguration.getInstance().getPortNumber());
        System.out.println(ProgramConfiguration.getInstance().getTimeout());
        System.out.println(ProgramConfiguration.getInstance().getURL());
    }
}

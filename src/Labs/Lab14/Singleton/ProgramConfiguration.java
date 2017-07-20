package Labs.Lab14.Singleton;

/*
Aaron Board

7/20/2017
 */
public class ProgramConfiguration {
    private int connectionLimit;
    private int portNumber;
    private String URL;
    private int timeout;
    private static ProgramConfiguration programConfiguration;

    public static ProgramConfiguration getInstance(){
        if (programConfiguration == null){
            programConfiguration = new ProgramConfiguration();
            return programConfiguration;
        } else {
            return programConfiguration;
        }
    }

    private ProgramConfiguration() {
    }

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}

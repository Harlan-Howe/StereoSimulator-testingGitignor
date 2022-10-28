public class HiFi
{
    // Adding a test message.
    // extra...extra... and again!
    private int volume;
    private float FM_station;
    private float balance;
    private boolean bluetoothConnected;
    private String currentTrack;
    private boolean isPlayingRadio;

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public float getFM_station()
    {
        return FM_station;
    }

    public void setFM_station(float FM_station)
    {
        this.FM_station = FM_station;
    }

    public float getBalance()
    {
        return balance;
    }

    public void setBalance(float balance)
    {
        this.balance = balance;
    }

    public boolean isBluetoothConnected()
    {
        return bluetoothConnected;
    }

    public void setBluetoothConnected(boolean bluetoothConnected)
    {
        this.bluetoothConnected = bluetoothConnected;
    }

    public String getCurrentTrack()
    {
        return currentTrack;
    }

    public void setCurrentTrack(String currentTrack)
    {
        this.currentTrack = currentTrack;
    }

    public boolean isPlayingRadio()
    {
        return isPlayingRadio;
    }

    public void setPlayingRadio(boolean playingRadio)
    {
        isPlayingRadio = playingRadio;
    }
}

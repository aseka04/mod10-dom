package dom;

enum chanels{
    Qazaqstan,
    ktk,
    balapan
}
class TV {
    void turn_on(){
        System.out.println("tv turned on");
    }

    void turn_off(){
        System.out.println("tv turned off");
    }
    void choice(chanels chanels){
        System.out.println("chanel: "+chanels);
    }
}
class AudioSystem{
    void turn_on(){
        System.out.println("audio system turned on");
    }

    void turn_off(){
        System.out.println("audio system turned off");
    }

    void volume(int volume){
        System.out.println("Volume: "+volume);
    }
}

class DVDPlayer{
    void start(){
        System.out.println("Video started");
    }

    void pause(){
        System.out.println("video paused");
    }

    void end(){
        System.out.println("video ended");
    }
}

class GameConsole{
    void turn_on(){
        System.out.println("game console turn on");
    }

    void start(){
        System.out.println("game started");
    }
}

class HomeTheaterFacade{
    TV tv;
    AudioSystem audioSystem;
    DVDPlayer dvdPlayer;
    GameConsole gameConsole;

    public HomeTheaterFacade(TV tv, AudioSystem audioSystem, DVDPlayer dvdPlayer, GameConsole gameConsole) {
        this.tv = tv;
        this.audioSystem = audioSystem;
        this.dvdPlayer = dvdPlayer;
        this.gameConsole = gameConsole;
    }

    void home_start(){
        tv.turn_on();
        tv.choice(chanels.balapan);
        audioSystem.turn_on();
        audioSystem.volume(25);
        dvdPlayer.start();
        dvdPlayer.pause();
        gameConsole.turn_on();
        gameConsole.start();
    }

    void home_end(){
        tv.turn_off();
        audioSystem.turn_off();
        dvdPlayer.end();

    }
}
class Main{
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audioSystem = new AudioSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        GameConsole gameConsole = new GameConsole();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv,audioSystem,dvdPlayer,gameConsole);

        homeTheaterFacade.home_start();
        System.out.println("---------------");
        homeTheaterFacade.home_end();
    }
}
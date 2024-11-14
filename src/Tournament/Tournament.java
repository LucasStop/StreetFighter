package Tournament;

import Player.Player;

import java.util.ArrayList;

public abstract class Tournament implements TournamentInterface {
    protected String name;
    protected ArrayList<Player> participants;
    protected String prize;
    protected int maxParticipants;

    public Tournament(String name, String prize, int maxParticipants) {
        this.name = name;
        this.prize = prize;
        this.maxParticipants = maxParticipants;
        this.participants = new ArrayList<>();
    }

    public String getName() { return this.name; }
    public String getPrize() { return this.prize; }
    public ArrayList<Player> getParticipants() { return this.participants; }

    public void addParticipant(Player character) throws Exception {
        if (this.participants.size() < this.maxParticipants) {
            this.participants.add(character);
        } else {
            throw new Exception("Número máximo de participantes atingido.");
        }
    }

    @Override
    public abstract void startTournament();
    @Override
    public abstract void declareWinner();
}

package Tournament;

import java.util.ArrayList;

import Player.Player;

public class TournamentTeam extends Tournament {
    private ArrayList<Player> team1;
    private ArrayList<Player> team2;

    public TournamentTeam(String name, String prize, int maxParticipants) {
        super(name, prize, maxParticipants);
        this.team1 = new ArrayList<>();
        this.team2 = new ArrayList<>();
    }

    public void addToTeam1(Player player) {
        team1.add(player);
    }

    public void addToTeam2(Player player) {
        team2.add(player);
    }

    @Override
    public void startTournament() {
        System.out.println("Torneio de equipe " + this.getName() + " iniciado!");
        ArrayList<Player> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public ArrayList<Player> startRound(ArrayList<Player> team1, ArrayList<Player> team2) {
        int team1Score = team1.stream().mapToInt(Player::getStrength).sum();
        int team2Score = team2.stream().mapToInt(Player::getStrength).sum();
        ArrayList<Player> winner = (team1Score > team2Score) ? team1 : team2;
        System.out.println("Equipe vencedora da rodada é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
        return winner;
    }

    @Override
    public void declareWinner() {
        ArrayList<Player> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public void declareWinner(ArrayList<Player> winner) {
        System.out.println("A equipe vencedora do torneio é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
    }
}

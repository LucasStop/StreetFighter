package Tournament;

import java.util.ArrayList;

import Character.Character;

public class TournamentTeam extends Tournament {
    private ArrayList<Character> team1;
    private ArrayList<Character> team2;

    public TournamentTeam(String name, String prize, int maxParticipants) {
        super(name, prize, maxParticipants);
        this.team1 = new ArrayList<>();
        this.team2 = new ArrayList<>();
    }

    public void addToTeam1(Character character) { team1.add(character); }
    public void addToTeam2(Character character) { team2.add(character); }

    @Override
    public void startTournament() {
        System.out.println("Torneio de equipe " + this.getName() + " iniciado!");
        ArrayList<Character> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public ArrayList<Character> startRound(ArrayList<Character> team1, ArrayList<Character> team2) {
        int team1Score = team1.stream().mapToInt(Character::getStrength).sum();
        int team2Score = team2.stream().mapToInt(Character::getStrength).sum();
        ArrayList<Character> winner = (team1Score > team2Score) ? team1 : team2;
        System.out.println("Equipe vencedora da rodada é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
        return winner;
    }

    @Override
    public void declareWinner() {
        ArrayList<Character> winningTeam = startRound(team1, team2);
        declareWinner(winningTeam);
    }

    public void declareWinner(ArrayList<Character> winner) {
        System.out.println("A equipe vencedora do torneio é: " + (winner == team1 ? "Equipe 1" : "Equipe 2"));
    }
}

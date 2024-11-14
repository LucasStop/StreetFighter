package Tournament;

import Player.Player;

public class TournamentIndividual extends Tournament {
    private int rounds;

    public TournamentIndividual(String name, String prize, int maxParticipants) {
        super(name, prize, maxParticipants);
        this.rounds = rounds;
    }

    @Override
    public void startTournament() {
        System.out.println("Torneio individual " + this.getName() + " iniciado com " + this.rounds + " rodadas!");
        for (int i = 1; i <= rounds; i++) {
            if (participants.size() < 2) break;
            System.out.println("Rodada " + i);
            startRound(participants.get(i - 1), participants.get((i % participants.size())));
        }
    }

    public Player startRound(Player player1, Player player2) {
        Player winner = (player1.getStrength() > player2.getStrength()) ? player1 : player2;
        System.out.println("Vencedor da rodada: " + winner.getName());
        return winner;
    }

    @Override
    public void declareWinner() {
        if (!participants.isEmpty()) {
            Player winner = participants.getFirst();
            System.out.println("O vencedor do torneio individual é " + winner.getName() + "!");
        } else {
            System.out.println("Nenhum participante para declarar vencedor.");
        }
    }
}

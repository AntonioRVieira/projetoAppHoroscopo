/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author AntônioVieira
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    // CRIANDO VÁRIAVEL PARA GUARDAR A MUSICA
    
    
    public Signos() {
        initComponents();
        RedimensionarImagens();
        PreencherPrevisao();
        PreencherMensagem();
        CorrigirAreaTexto();
    }

   // TODA FUNÇÃO É CRIADA ABAIXO DO CONSTRUTOR 
    
   public void RedimensionarImagens(){ 
    //capturar as imagens que estão dentro da label
    ImageIcon aries = (ImageIcon) imgSigno.getIcon();
    ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
    ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
    ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
    ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
    ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
    ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
    ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
    ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
    ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
    ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
    ImageIcon carpricornio = (ImageIcon) imgSignoCarpricornio.getIcon();
    
    // redimensionar o tamanho delas
    Image imgAries = aries.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgAquario = aquario.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgCancer = cancer.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgGemeos = gemeos.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgLeao = leao.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgVirgem = virgem.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgLibra = libra.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgTouro = touro.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgEscorpiao = escorpiao.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
    Image imgPeixes = peixes.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
  Image imgSagitario = sagitario.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);
    Image imgCarpricornio = carpricornio.getImage().getScaledInstance(200, 220, Image.SCALE_SMOOTH);

  
  //JOGAR A IMAGEM REDIMENSIONADA NA LABEL NOVAMENTE
  imgSigno.setIcon(new ImageIcon (imgAries));
  imgSignoAquario.setIcon(new ImageIcon (imgAquario));
  imgSignoCancer.setIcon(new ImageIcon (imgCancer));
  imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
  imgSignoLeao.setIcon(new ImageIcon (imgLeao));
  imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
  imgSignoLibra.setIcon(new ImageIcon (imgLibra));
  imgSignoTouro.setIcon(new ImageIcon (imgTouro));
  imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
  imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));
  imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
  imgSignoCarpricornio.setIcon(new ImageIcon (imgCarpricornio));
  
  
  
    
   } // fim da função
   
  public void PreencherPrevisao(){ 
   // verificar o dia da semana
   // LocalDate - puxa a data do computador
   int diaSemana = LocalDate.now().getDayOfWeek().getValue();
   
   // CRIAR A CONDICIONAL PARA PREENCHER O CAMPO PREVISAO.
   switch(diaSemana) {

    case 1: // Segunda-feira
        txPrevisaoAries.setText("Áries: Comece a semana com energia e determinação.");
        txPrevisaoTouro.setText("Touro: Tenha paciência e organize suas tarefas.");
        txPrevisaoGemeos.setText("Gêmeos: A comunicação será importante hoje.");
        txPrevisaoCancer.setText("Câncer: Valorize os momentos com pessoas queridas.");
        txPrevisaoLeao.setText("Leão: Mostre confiança para enfrentar os desafios.");
        txPrevisaoVirgem.setText("Virgem: Organização será sua maior aliada.");
        txPrevisaoLibra.setText("Libra: Busque equilíbrio em suas decisões.");
        txPrevisaoEscorpiao.setText("Escorpião: Mantenha o foco nos seus objetivos.");
        txPrevisaoSagitario.setText("Sagitário: Comece a semana com entusiasmo.");
        txPrevisaoCarpricornio.setText("Capricórnio: Disciplina ajudará você a alcançar seus objetivos.");
        txPrevisaoAquario.setText("Aquário: Uma ideia criativa pode ajudar no seu dia.");
        txPrevisaoPeixes.setText("Peixes: Comece a semana com pensamentos positivos.");
        break;

    case 2: // Terça-feira
        txPrevisaoAries.setText("Áries: Uma oportunidade pode aparecer inesperadamente.");
        txPrevisaoTouro.setText("Touro: Um bom dia para resolver assuntos importantes.");
        txPrevisaoGemeos.setText("Gêmeos: Uma conversa pode trazer uma nova oportunidade.");
        txPrevisaoCancer.setText("Câncer: Procure manter a calma diante dos desafios.");
        txPrevisaoLeao.setText("Leão: Sua determinação ajudará em uma tarefa importante.");
        txPrevisaoVirgem.setText("Virgem: Concentre-se nas tarefas mais importantes.");
        txPrevisaoLibra.setText("Libra: Uma boa conversa pode resolver uma situação.");
        txPrevisaoEscorpiao.setText("Escorpião: Confie na sua capacidade de resolver problemas.");
        txPrevisaoSagitario.setText("Sagitário: Uma nova ideia pode chamar sua atenção.");
        txPrevisaoCarpricornio.setText("Capricórnio: Continue trabalhando com determinação.");
        txPrevisaoAquario.setText("Aquário: Compartilhe suas ideias com quem confia.");
        txPrevisaoPeixes.setText("Peixes: Sua sensibilidade será importante hoje.");
        break;

    case 3: // Quarta-feira
        txPrevisaoAries.setText("Áries: Evite decisões impulsivas e pense antes de agir.");
        txPrevisaoTouro.setText("Touro: Tenha paciência e evite decisões por impulso.");
        txPrevisaoGemeos.setText("Gêmeos: Uma conversa pode mudar sua forma de pensar.");
        txPrevisaoCancer.setText("Câncer: Um momento em família pode trazer alegria.");
        txPrevisaoLeao.setText("Leão: Evite conflitos e procure ouvir as outras pessoas.");
        txPrevisaoVirgem.setText("Virgem: Não se preocupe demais com pequenos detalhes.");
        txPrevisaoLibra.setText("Libra: Evite deixar decisões importantes para depois.");
        txPrevisaoEscorpiao.setText("Escorpião: Evite agir com pressa.");
        txPrevisaoSagitario.setText("Sagitário: Tenha cuidado para não assumir compromissos demais.");
        txPrevisaoCarpricornio.setText("Capricórnio: Não deixe a preocupação atrapalhar seu dia.");
        txPrevisaoAquario.setText("Aquário: Procure enxergar uma situação por outro ponto de vista.");
        txPrevisaoPeixes.setText("Peixes: Reserve um momento para organizar seus pensamentos.");
        break;

    case 4: // Quinta-feira
        txPrevisaoAries.setText("Áries: Novos desafios podem trazer boas experiências.");
        txPrevisaoTouro.setText("Touro: Novas oportunidades podem surgir hoje.");
        txPrevisaoGemeos.setText("Gêmeos: Evite distrações e concentre-se nos seus objetivos.");
        txPrevisaoCancer.setText("Câncer: Confie mais nas suas decisões.");
        txPrevisaoLeao.setText("Leão: Um projeto pode começar a apresentar bons resultados.");
        txPrevisaoVirgem.setText("Virgem: Seu esforço poderá trazer bons resultados.");
        txPrevisaoLibra.setText("Libra: O dia favorece novas ideias e possibilidades.");
        txPrevisaoEscorpiao.setText("Escorpião: Uma mudança pode trazer novas possibilidades.");
        txPrevisaoSagitario.setText("Sagitário: O dia pode trazer uma oportunidade interessante.");
        txPrevisaoCarpricornio.setText("Capricórnio: Seus esforços podem começar a ser reconhecidos.");
        txPrevisaoAquario.setText("Aquário: Um novo projeto pode despertar seu interesse.");
        txPrevisaoPeixes.setText("Peixes: Uma boa notícia pode melhorar seu dia.");
        break;

    case 5: // Sexta-feira
        txPrevisaoAries.setText("Áries: Aproveite o dia para comemorar suas conquistas.");
        txPrevisaoTouro.setText("Touro: Aproveite o dia para descansar e estar com pessoas queridas.");
        txPrevisaoGemeos.setText("Gêmeos: Aproveite o dia para se divertir e relaxar.");
        txPrevisaoCancer.setText("Câncer: O dia favorece momentos de descontração.");
        txPrevisaoLeao.setText("Leão: Aproveite a sexta-feira para comemorar suas conquistas.");
        txPrevisaoVirgem.setText("Virgem: Termine a semana com sensação de dever cumprido.");
        txPrevisaoLibra.setText("Libra: Aproveite o dia para estar perto de pessoas especiais.");
        txPrevisaoEscorpiao.setText("Escorpião: Aproveite para concluir suas pendências.");
        txPrevisaoSagitario.setText("Sagitário: Aproveite a sexta para se divertir.");
        txPrevisaoCarpricornio.setText("Capricórnio: Finalize suas tarefas antes de descansar.");
        txPrevisaoAquario.setText("Aquário: Aproveite o dia para fazer algo diferente.");
        txPrevisaoPeixes.setText("Peixes: Aproveite a sexta-feira para relaxar.");
        break;

    case 6: // Sábado
        txPrevisaoAries.setText("Áries: Aproveite o sábado para se divertir.");
        txPrevisaoTouro.setText("Touro: Um ótimo dia para aproveitar momentos de lazer.");
        txPrevisaoGemeos.setText("Gêmeos: Um passeio pode deixar seu dia mais agradável.");
        txPrevisaoCancer.setText("Câncer: Aproveite o sábado para cuidar de você.");
        txPrevisaoLeao.setText("Leão: Divirta-se e aproveite bons momentos.");
        txPrevisaoVirgem.setText("Virgem: Reserve um tempo para descansar.");
        txPrevisaoLibra.setText("Libra: Um momento de lazer fará bem ao seu dia.");
        txPrevisaoEscorpiao.setText("Escorpião: Um programa diferente pode tornar seu sábado especial.");
        txPrevisaoSagitario.setText("Sagitário: Um passeio pode renovar suas energias.");
        txPrevisaoCarpricornio.setText("Capricórnio: Permita-se descansar e aproveitar o momento.");
        txPrevisaoAquario.setText("Aquário: Novas experiências podem deixar seu sábado divertido.");
        txPrevisaoPeixes.setText("Peixes: Faça algo que você realmente gosta.");
        break;

    case 7: // Domingo
        txPrevisaoAries.setText("Áries: Descanse e prepare-se para uma nova semana.");
        txPrevisaoTouro.setText("Touro: Recarregue as energias para a próxima semana.");
        txPrevisaoGemeos.setText("Gêmeos: Organize seus planos para a próxima semana.");
        txPrevisaoCancer.setText("Câncer: Descanse e prepare-se para uma nova semana.");
        txPrevisaoLeao.setText("Leão: Planeje tranquilamente os próximos dias.");
        txPrevisaoVirgem.setText("Virgem: Planeje tranquilamente os próximos dias.");
        txPrevisaoLibra.setText("Libra: Termine a semana com tranquilidade.");
        txPrevisaoEscorpiao.setText("Escorpião: Reflita sobre seus próximos objetivos.");
        txPrevisaoSagitario.setText("Sagitário: Prepare-se para uma nova semana.");
        txPrevisaoCarpricornio.setText("Capricórnio: Organize suas prioridades para a próxima semana.");
        txPrevisaoAquario.setText("Aquário: Relaxe e aproveite o domingo.");
        txPrevisaoPeixes.setText("Peixes: Termine a semana com tranquilidade.");
        break;
}
   
   
   
   
   
   
  }// fim da função
    
  
  public void PreencherMensagem(){
      //CAPTURAR DO DIA DA SEMANA
      int diaSemana = LocalDate.now().getDayOfWeek().getValue();
      
      //CONDICIONAL
     switch(diaSemana) {

    case 1: // Segunda-feira
        txMensagemAries.setText("Mensagem: Acredite em você e dê o primeiro passo.");
        txMensagemTouro.setText("Mensagem: Tenha paciência, tudo acontece no momento certo.");
        txMensagemGemeos.setText("Mensagem: Uma boa conversa pode abrir novos caminhos.");
        txMensagemCancer.setText("Mensagem: Valorize quem está ao seu lado.");
        txMensagemLeao.setText("Mensagem: Confie no seu potencial e siga em frente.");
        txMensagemVirgem.setText("Mensagem: Organize seus pensamentos e mantenha o foco.");
        txMensagemLibra.setText("Mensagem: Procure equilíbrio antes de tomar decisões.");
        txMensagemEscorpiao.setText("Mensagem: Não tenha medo de começar algo novo.");
        txMensagemSagitario.setText("Mensagem: Mantenha o entusiasmo diante dos desafios.");
        txMensagemCarpricornio.setText("Mensagem: Pequenos passos também levam a grandes conquistas.");
        txMensagemAquario.setText("Mensagem: Sua criatividade pode transformar seu dia.");
        txMensagemPeixes.setText("Mensagem: Confie na sua intuição e mantenha a esperança.");
        break;

    case 2: // Terça-feira
        txMensagemAries.setText("Mensagem: Transforme seus desafios em oportunidades.");
        txMensagemTouro.setText("Mensagem: A persistência é o caminho para alcançar seus objetivos.");
        txMensagemGemeos.setText("Mensagem: Compartilhe suas ideias e inspire outras pessoas.");
        txMensagemCancer.setText("Mensagem: Seu carinho pode fazer a diferença na vida de alguém.");
        txMensagemLeao.setText("Mensagem: Você é capaz de superar aquilo que parece difícil.");
        txMensagemVirgem.setText("Mensagem: Faça o seu melhor, sem se cobrar demais.");
        txMensagemLibra.setText("Mensagem: Escute os outros, mas também confie em sua opinião.");
        txMensagemEscorpiao.setText("Mensagem: Sua força está na capacidade de recomeçar.");
        txMensagemSagitario.setText("Mensagem: Aproveite as oportunidades que aparecerem.");
        txMensagemCarpricornio.setText("Mensagem: Continue firme, seus esforços terão valor.");
        txMensagemAquario.setText("Mensagem: Pense diferente e encontre novas possibilidades.");
        txMensagemPeixes.setText("Mensagem: Espalhe gentileza por onde passar.");
        break;

    case 3: // Quarta-feira
        txMensagemAries.setText("Mensagem: Respire fundo e mantenha a calma.");
        txMensagemTouro.setText("Mensagem: Não tenha pressa, cada conquista tem seu tempo.");
        txMensagemGemeos.setText("Mensagem: Aprenda algo novo e permita-se crescer.");
        txMensagemCancer.setText("Mensagem: Cuide também de quem sempre cuida de você.");
        txMensagemLeao.setText("Mensagem: Seja confiante, mas não deixe de ouvir os outros.");
        txMensagemVirgem.setText("Mensagem: Nem tudo precisa ser perfeito para dar certo.");
        txMensagemLibra.setText("Mensagem: A tranquilidade ajuda a enxergar melhores soluções.");
        txMensagemEscorpiao.setText("Mensagem: Deixe o passado ensinar, não impedir seu futuro.");
        txMensagemSagitario.setText("Mensagem: Mantenha a mente aberta para novas experiências.");
        txMensagemCarpricornio.setText("Mensagem: Não desista só porque o resultado ainda não apareceu.");
        txMensagemAquario.setText("Mensagem: Uma ideia simples pode fazer grande diferença.");
        txMensagemPeixes.setText("Mensagem: Valorize seus sentimentos e siga com confiança.");
        break;

    case 4: // Quinta-feira
        txMensagemAries.setText("Mensagem: Sua coragem pode inspirar quem está ao seu redor.");
        txMensagemTouro.setText("Mensagem: Valorize as pequenas conquistas do seu dia.");
        txMensagemGemeos.setText("Mensagem: Use suas palavras para construir, não para dividir.");
        txMensagemCancer.setText("Mensagem: Um gesto de carinho pode transformar um momento.");
        txMensagemLeao.setText("Mensagem: Mostre sua força através de atitudes positivas.");
        txMensagemVirgem.setText("Mensagem: Continue avançando, mesmo que seja devagar.");
        txMensagemLibra.setText("Mensagem: Escolha aquilo que traz paz para sua vida.");
        txMensagemEscorpiao.setText("Mensagem: Confie no processo e não desista dos seus sonhos.");
        txMensagemSagitario.setText("Mensagem: A vida fica melhor quando você se permite explorar.");
        txMensagemCarpricornio.setText("Mensagem: Seus objetivos merecem dedicação e paciência.");
        txMensagemAquario.setText("Mensagem: Não tenha medo de ser diferente.");
        txMensagemPeixes.setText("Mensagem: Sua sensibilidade também é uma forma de força.");
        break;

    case 5: // Sexta-feira
        txMensagemAries.setText("Mensagem: Celebre suas conquistas, mesmo as pequenas.");
        txMensagemTouro.setText("Mensagem: Aproveite o dia e reconheça tudo que você já conquistou.");
        txMensagemGemeos.setText("Mensagem: Sorria mais e aproveite os bons momentos.");
        txMensagemCancer.setText("Mensagem: Esteja perto de quem faz seu coração feliz.");
        txMensagemLeao.setText("Mensagem: Você merece reconhecer o seu próprio esforço.");
        txMensagemVirgem.setText("Mensagem: Termine a semana com a sensação de dever cumprido.");
        txMensagemLibra.setText("Mensagem: Permita-se aproveitar os momentos simples.");
        txMensagemEscorpiao.setText("Mensagem: Deixe para trás aquilo que não pode mais mudar.");
        txMensagemSagitario.setText("Mensagem: Aproveite a vida e crie boas lembranças.");
        txMensagemCarpricornio.setText("Mensagem: Depois do esforço, também é importante descansar.");
        txMensagemAquario.setText("Mensagem: Faça algo que desperte sua criatividade.");
        txMensagemPeixes.setText("Mensagem: Um pouco de alegria pode mudar completamente o seu dia.");
        break;

    case 6: // Sábado
        txMensagemAries.setText("Mensagem: Aproveite o momento e divirta-se.");
        txMensagemTouro.setText("Mensagem: Descanse e aproveite as coisas boas da vida.");
        txMensagemGemeos.setText("Mensagem: Um novo passeio pode trazer boas lembranças.");
        txMensagemCancer.setText("Mensagem: Aproveite o tempo com sua família e amigos.");
        txMensagemLeao.setText("Mensagem: Hoje é um ótimo dia para fazer algo que você gosta.");
        txMensagemVirgem.setText("Mensagem: Deixe um pouco as preocupações de lado.");
        txMensagemLibra.setText("Mensagem: Procure momentos que tragam alegria e tranquilidade.");
        txMensagemEscorpiao.setText("Mensagem: Aproveite o dia para renovar suas energias.");
        txMensagemSagitario.setText("Mensagem: Viva novas experiências e aproveite o sábado.");
        txMensagemCarpricornio.setText("Mensagem: Permita-se descansar sem pensar nas obrigações.");
        txMensagemAquario.setText("Mensagem: Faça algo diferente e aproveite sua liberdade.");
        txMensagemPeixes.setText("Mensagem: Dedique um tempo para aquilo que faz você feliz.");
        break;

    case 7: // Domingo
        txMensagemAries.setText("Mensagem: Prepare-se para uma nova semana com confiança.");
        txMensagemTouro.setText("Mensagem: Descanse e renove suas energias.");
        txMensagemGemeos.setText("Mensagem: Pense nos seus próximos objetivos.");
        txMensagemCancer.setText("Mensagem: Agradeça pelas pessoas especiais que fazem parte da sua vida.");
        txMensagemLeao.setText("Mensagem: Acredite que uma nova semana pode trazer novas conquistas.");
        txMensagemVirgem.setText("Mensagem: Organize seus planos e comece novamente com tranquilidade.");
        txMensagemLibra.setText("Mensagem: Deixe a semana terminar em paz e harmonia.");
        txMensagemEscorpiao.setText("Mensagem: Reflita sobre o que realmente importa para você.");
        txMensagemSagitario.setText("Mensagem: Olhe para a próxima semana com esperança.");
        txMensagemCarpricornio.setText("Mensagem: Planeje seus próximos passos com calma.");
        txMensagemAquario.setText("Mensagem: Novas ideias podem surgir quando você desacelera.");
        txMensagemPeixes.setText("Mensagem: Termine o domingo acreditando em dias melhores.");
        break;
}//fim do swicth
  
      }//fim do preecherMensagem   
  
  public void CorrigirAreaTexto(){
    // =====================================================
//                  MENSAGEM
// =====================================================

txMensagemAries.setLineWrap(true);
txMensagemAries.setWrapStyleWord(true);

txMensagemTouro.setLineWrap(true);
txMensagemTouro.setWrapStyleWord(true);

txMensagemGemeos.setLineWrap(true);
txMensagemGemeos.setWrapStyleWord(true);

txMensagemCancer.setLineWrap(true);
txMensagemCancer.setWrapStyleWord(true);

txMensagemLeao.setLineWrap(true);
txMensagemLeao.setWrapStyleWord(true);

txMensagemVirgem.setLineWrap(true);
txMensagemVirgem.setWrapStyleWord(true);

txMensagemLibra.setLineWrap(true);
txMensagemLibra.setWrapStyleWord(true);

txMensagemEscorpiao.setLineWrap(true);
txMensagemEscorpiao.setWrapStyleWord(true);

txMensagemSagitario.setLineWrap(true);
txMensagemSagitario.setWrapStyleWord(true);

txMensagemCarpricornio.setLineWrap(true);
txMensagemCarpricornio.setWrapStyleWord(true);

txMensagemAquario.setLineWrap(true);
txMensagemAquario.setWrapStyleWord(true);

txMensagemPeixes.setLineWrap(true);
txMensagemPeixes.setWrapStyleWord(true);


// =====================================================
//                  PREVISÃO
// =====================================================

txPrevisaoAries.setLineWrap(true);
txPrevisaoAries.setWrapStyleWord(true);

txPrevisaoTouro.setLineWrap(true);
txPrevisaoTouro.setWrapStyleWord(true);

txPrevisaoGemeos.setLineWrap(true);
txPrevisaoGemeos.setWrapStyleWord(true);

txPrevisaoCancer.setLineWrap(true);
txPrevisaoCancer.setWrapStyleWord(true);

txPrevisaoLeao.setLineWrap(true);
txPrevisaoLeao.setWrapStyleWord(true);

txPrevisaoVirgem.setLineWrap(true);
txPrevisaoVirgem.setWrapStyleWord(true);

txPrevisaoLibra.setLineWrap(true);
txPrevisaoLibra.setWrapStyleWord(true);

txPrevisaoEscorpiao.setLineWrap(true);
txPrevisaoEscorpiao.setWrapStyleWord(true);

txPrevisaoSagitario.setLineWrap(true);
txPrevisaoSagitario.setWrapStyleWord(true);

txPrevisaoCarpricornio.setLineWrap(true);
txPrevisaoCarpricornio.setWrapStyleWord(true);

txPrevisaoAquario.setLineWrap(true);
txPrevisaoAquario.setWrapStyleWord(true);

txPrevisaoPeixes.setLineWrap(true);
txPrevisaoPeixes.setWrapStyleWord(true);


// =====================================================
//                  PONTOS FORTES
// =====================================================

txFortesAries.setLineWrap(true);
txFortesAries.setWrapStyleWord(true);

txFortesTouro.setLineWrap(true);
txFortesTouro.setWrapStyleWord(true);

txFortesGemeos.setLineWrap(true);
txFortesGemeos.setWrapStyleWord(true);

txFortesCancer.setLineWrap(true);
txFortesCancer.setWrapStyleWord(true);

txFortesLeao.setLineWrap(true);
txFortesLeao.setWrapStyleWord(true);

txFortesVirgem.setLineWrap(true);
txFortesVirgem.setWrapStyleWord(true);

txFortesLibra.setLineWrap(true);
txFortesLibra.setWrapStyleWord(true);

txFortesEscorpiao.setLineWrap(true);
txFortesEscorpiao.setWrapStyleWord(true);

txFortesSagitario.setLineWrap(true);
txFortesSagitario.setWrapStyleWord(true);

txFortesCarpricornio.setLineWrap(true);
txFortesCarpricornio.setWrapStyleWord(true);

txFortesAquario.setLineWrap(true);
txFortesAquario.setWrapStyleWord(true);

txFortesPeixes.setLineWrap(true);
txFortesPeixes.setWrapStyleWord(true);


// =====================================================
//                PONTOS A MELHORAR
// =====================================================

txMelhorarAries.setLineWrap(true);
txMelhorarAries.setWrapStyleWord(true);

txMelhorarTouro.setLineWrap(true);
txMelhorarTouro.setWrapStyleWord(true);

txMelhorarCancer.setLineWrap(true);
txMelhorarCancer.setWrapStyleWord(true);

txMelhorarCancer.setLineWrap(true);
txMelhorarCancer.setWrapStyleWord(true);

txMelhorarLeao.setLineWrap(true);
txMelhorarLeao.setWrapStyleWord(true);

txMelhorarVirgem.setLineWrap(true);
txMelhorarVirgem.setWrapStyleWord(true);

txMelhorarLibra.setLineWrap(true);
txMelhorarLibra.setWrapStyleWord(true);

txMelhorarEscorpiao.setLineWrap(true);
txMelhorarEscorpiao.setWrapStyleWord(true);

txMelhorarSagitario.setLineWrap(true);
txMelhorarSagitario.setWrapStyleWord(true);

txMelhorarCarpricornio.setLineWrap(true);
txMelhorarCarpricornio.setWrapStyleWord(true);

txMelhorarAquario.setLineWrap(true);
txMelhorarAquario.setWrapStyleWord(true);

txMelhorarPeixes.setLineWrap(true);
txMelhorarPeixes.setWrapStyleWord(true);
      
  }
  
 public  void CalcularSigno(){
  //capturar dados da combobox
  // covertendo texto em numero inteiro (Integer, Double, Boolean)  
  int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
  String mes = cbMes.getSelectedItem().toString();
  
  // Variável que guarda a imagem do signo
  ImageIcon imagem = null;
  
  //verificar dia e mes dos signos com if else
  if((mes.equalsIgnoreCase("Março") && dia>=21) || (mes.equalsIgnoreCase("Abril") && dia<=19) ){
  signo.setText("Áries");
  imagem = (ImageIcon) imgSigno.getIcon();//capturar sua img
  
  }else if((mes.equalsIgnoreCase("Abril") && dia>=20) || (mes.equalsIgnoreCase("Maio") && dia<=20) ){
  signo.setText("Touro");
  imagem = (ImageIcon) imgSignoTouro.getIcon();
  
  }else if((mes.equalsIgnoreCase(""
          + "Maio") && dia>=20) || (mes.equalsIgnoreCase("Junho") && dia<=19) ){
  signo.setText("Gêmeos");
  imagem = (ImageIcon) imgSignoGemeos.getIcon();
  
  }else if((mes.equalsIgnoreCase("Junho") && dia>=21) || (mes.equalsIgnoreCase("Julho") && dia<=20) ){
  signo.setText("Câncer");
  imagem = (ImageIcon) imgSignoCancer.getIcon();
  
  }else if((mes.equalsIgnoreCase("Julho") && dia>=21) || (mes.equalsIgnoreCase("Agosto") && dia<=20) ){
  signo.setText("Leão");
  imagem = (ImageIcon) imgSignoLeao.getIcon();
  
  }else if((mes.equalsIgnoreCase("Agosto") && dia>=21) || (mes.equalsIgnoreCase("Setembro") && dia<=20) ){
  signo.setText("Virgem");
  imagem = (ImageIcon) imgSignoVirgem.getIcon();
  
  }else if((mes.equalsIgnoreCase("Setembro") && dia>=21) || (mes.equalsIgnoreCase("Outro") && dia<=20) ){
  signo.setText("Libra");
  imagem = (ImageIcon) imgSignoLibra.getIcon();
  
  }else if((mes.equalsIgnoreCase("Outubro") && dia>=21) || (mes.equalsIgnoreCase("Novembro") && dia<=20) ){
  signo.setText("Escorpião");
  imagem = (ImageIcon) imgSignoEscorpiao.getIcon(); 
  
  }else if((mes.equalsIgnoreCase("Novembro") && dia>=21) || (mes.equalsIgnoreCase("Dezembro") && dia<=20) ){
  signo.setText("Sagitário");
  imagem = (ImageIcon) imgSignoSagitario.getIcon();
  
  }else if((mes.equalsIgnoreCase("Dezembro") && dia>=21) || (mes.equalsIgnoreCase("Janeiro") && dia<=19) ){
  signo.setText("Carpricórnio");
  imagem = (ImageIcon) imgSignoCarpricornio.getIcon();
  
  }else if((mes.equalsIgnoreCase("Janeiro") && dia>=20) || (mes.equalsIgnoreCase("Fevereiro") && dia<=19) ){
  signo.setText("Aquário");
  imagem = (ImageIcon) imgSignoAquario.getIcon();
  
  }else if((mes.equalsIgnoreCase("Fevereiro") && dia>=21) || (mes.equalsIgnoreCase("Março") && dia<=19) ){
  signo.setText("Peixes");
  imagem = (ImageIcon) imgSignoPeixes.getIcon();
  }
  // para preecher o botão azul, substitua bntSigno pelo nome dele:
  btnSigno.setIcon(imagem);
  
 }//fim do calcular signo
  
  public void CalcularCompatibilidade(){
     //capturar os dados combax 
     String signo1 = cbSigno1.getSelectedItem().toString();
     String signo2 = cbSigno2.getSelectedItem().toString();
     
 
// LIMPA O RESULTADO ANTERIOR
tfCompatibilidade.setText("");


// ==================== ÁRIES ====================
if (signo1.equalsIgnoreCase("Áries")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("55% compatibilidade!");
    }


// ==================== TOURO ====================
} else if (signo1.equalsIgnoreCase("Touro")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("80% compatibilidade!");
    }


// ==================== GÊMEOS ====================
} else if (signo1.equalsIgnoreCase("Gêmeos")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("55% compatibilidade!");
    }


// ==================== CÂNCER ====================
} else if (signo1.equalsIgnoreCase("Câncer")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("75% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("95% compatibilidade!");
    }


// ==================== LEÃO ====================
} else if (signo1.equalsIgnoreCase("Leão")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("60% compatibilidade!");
    }


// ==================== VIRGEM ====================
} else if (signo1.equalsIgnoreCase("Virgem")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("80% compatibilidade!");
    }


// ==================== LIBRA ====================
} else if (signo1.equalsIgnoreCase("Libra")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("70% compatibilidade!");
    }


// ==================== ESCORPIÃO ====================
} else if (signo1.equalsIgnoreCase("Escorpião")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("95% compatibilidade!");
    }


// ==================== SAGITÁRIO ====================
} else if (signo1.equalsIgnoreCase("Sagitário")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("60% compatibilidade!");
    }


// ==================== CAPRICÓRNIO ====================
} else if (signo1.equalsIgnoreCase("Capricórnio")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("75% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("85% compatibilidade!");
    }


// ==================== AQUÁRIO ====================
} else if (signo1.equalsIgnoreCase("Aquário")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("90% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("45% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("50% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("100% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("65% compatibilidade!");
    }


// ==================== PEIXES ====================
} else if (signo1.equalsIgnoreCase("Peixes")) {

    if (signo2.equalsIgnoreCase("Áries")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Touro")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Gêmeos")) {
        tfCompatibilidade.setText("55% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Câncer")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Leão")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Virgem")) {
        tfCompatibilidade.setText("80% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Libra")) {
        tfCompatibilidade.setText("70% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Escorpião")) {
        tfCompatibilidade.setText("95% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Sagitário")) {
        tfCompatibilidade.setText("60% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Capricórnio")) {
        tfCompatibilidade.setText("85% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Aquário")) {
        tfCompatibilidade.setText("65% compatibilidade!");

    } else if (signo2.equalsIgnoreCase("Peixes")) {
        tfCompatibilidade.setText("100% compatibilidade!");
    }
}
             
  }// fim do CalcularCompatibilidade
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        areaDescobrirSigno = new javax.swing.JPanel();
        descobraSeuSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaInformacoes = new javax.swing.JPanel();
        imgSigno = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numerosAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumerosAries = new javax.swing.JTextField();
        areaMensagem1 = new javax.swing.JPanel();
        tituloMensagemAries1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        btnCopiarMensagem1 = new javax.swing.JButton();
        areaPrevisoe = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarAries = new javax.swing.JButton();
        areaCaracteristicas = new javax.swing.JPanel();
        pfortesAries = new javax.swing.JLabel();
        tituloCaracteristicaAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        fundoAries = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAries1 = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numerosAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumerosAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMensagemAquario = new javax.swing.JButton();
        areaPrevisoeAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarAquario = new javax.swing.JButton();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        pfortesAquario = new javax.swing.JLabel();
        tituloCaracteristicaAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        fundoAquario = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numerosCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumerosCancer = new javax.swing.JTextField();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        pfortesCancer = new javax.swing.JLabel();
        tituloCaracteristicaCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaPrevisoeCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarCancer = new javax.swing.JButton();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMensagemCancer = new javax.swing.JButton();
        fundoGemeos = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numerosGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumerosGemeos = new javax.swing.JTextField();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        pfortesGemeos1 = new javax.swing.JLabel();
        tituloCaracteristicaGemeos1 = new javax.swing.JLabel();
        pMelhorarGemeos1 = new javax.swing.JLabel();
        jScrollPane43 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        txMelhorarGemeos1 = new javax.swing.JTextArea();
        areaPrevisoeGemeos = new javax.swing.JPanel();
        previsaoGemeos1 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarGemeos1 = new javax.swing.JButton();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos1 = new javax.swing.JLabel();
        amorGemeos1 = new javax.swing.JLabel();
        trabalhoGemeos1 = new javax.swing.JLabel();
        saudeGemeos1 = new javax.swing.JLabel();
        sorteGemeos1 = new javax.swing.JLabel();
        tfAmorGemeos1 = new javax.swing.JTextField();
        tfTrabalhoGemeos1 = new javax.swing.JTextField();
        tfSaudeGemeos1 = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMensagemGemeos1 = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numerosLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumerosLeao = new javax.swing.JTextField();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        pfortesLeao = new javax.swing.JLabel();
        tituloCaracteristicaLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane46 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaPrevisoeLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarLeao = new javax.swing.JButton();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMensagemLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numerosVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumerosVirgem = new javax.swing.JTextField();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        pfortesVirgem = new javax.swing.JLabel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane47 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane48 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaPrevisoeVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarVirgem = new javax.swing.JButton();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMensagemVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numerosLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumerosLibra = new javax.swing.JTextField();
        areaCaracteristicasv = new javax.swing.JPanel();
        pfortesLibra = new javax.swing.JLabel();
        tituloCaracteristicaLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaPrevisoeLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarLibra = new javax.swing.JButton();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMensagemLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacoesTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numerosTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumerosTouro = new javax.swing.JTextField();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        pfortesTouro = new javax.swing.JLabel();
        tituloCaracteristicaTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaTouro = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        tfTrabalhoTouro = new javax.swing.JTextField();
        tfSaudeTouro = new javax.swing.JTextField();
        tfSorteTouro = new javax.swing.JTextField();
        areaEnergiaTouro1 = new javax.swing.JPanel();
        tituloEnergiaTouro1 = new javax.swing.JLabel();
        amorTouro1 = new javax.swing.JLabel();
        trabalhoTouro1 = new javax.swing.JLabel();
        saudeTouro1 = new javax.swing.JLabel();
        sorteTouro1 = new javax.swing.JLabel();
        tfAmorTouro1 = new javax.swing.JTextField();
        tfTrabalhoTouro1 = new javax.swing.JTextField();
        tfSaudeTouro1 = new javax.swing.JTextField();
        tfSorteTouro1 = new javax.swing.JTextField();
        areaInformacoes3 = new javax.swing.JPanel();
        imgSignoTouro2 = new javax.swing.JLabel();
        tituloTouro2 = new javax.swing.JLabel();
        periodoTouro2 = new javax.swing.JLabel();
        elementoTouro2 = new javax.swing.JLabel();
        planetaTouro2 = new javax.swing.JLabel();
        corTouro2 = new javax.swing.JLabel();
        numerosTouro2 = new javax.swing.JLabel();
        tfPeriodoTouro2 = new javax.swing.JTextField();
        tfElementoTouro2 = new javax.swing.JTextField();
        tfPlanetaTouro2 = new javax.swing.JTextField();
        tfCorTouro2 = new javax.swing.JTextField();
        tfNumerosTouro2 = new javax.swing.JTextField();
        areaCaracteristicas3 = new javax.swing.JPanel();
        pfortesTouro2 = new javax.swing.JLabel();
        tituloCaracteristicaTouro2 = new javax.swing.JLabel();
        pMelhorarTouro2 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        txFortesTouro2 = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        txMelhorarTouro2 = new javax.swing.JTextArea();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMensagemTouro = new javax.swing.JButton();
        areaPrevisoeTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        escorpiao = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numerosEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumerosEscorpiao = new javax.swing.JTextField();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        pfortesEscorpiao = new javax.swing.JLabel();
        tituloCaracteristicaEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane51 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane52 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaPrevisoeEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMensagemEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numerosPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumerosPeixes = new javax.swing.JTextField();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        pfortesPeixes = new javax.swing.JLabel();
        tituloCaracteristicaPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaEnergiaPeixe = new javax.swing.JPanel();
        tituloEnergiaTouro2 = new javax.swing.JLabel();
        amorTouro2 = new javax.swing.JLabel();
        trabalhoTouro2 = new javax.swing.JLabel();
        saudeTouro2 = new javax.swing.JLabel();
        sorteTouro2 = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudeTouro2 = new javax.swing.JTextField();
        tfSorteTouro2 = new javax.swing.JTextField();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        tfAmorPeixe = new javax.swing.JTextField();
        tfTrabalhoPeixe = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaInformacoes4 = new javax.swing.JPanel();
        imgSignoTouro3 = new javax.swing.JLabel();
        tituloTouro3 = new javax.swing.JLabel();
        periodoTouro3 = new javax.swing.JLabel();
        elementoTouro3 = new javax.swing.JLabel();
        planetaTouro3 = new javax.swing.JLabel();
        corTouro3 = new javax.swing.JLabel();
        numerosTouro3 = new javax.swing.JLabel();
        tfPeriodoTouro3 = new javax.swing.JTextField();
        tfElementoTouro3 = new javax.swing.JTextField();
        tfPlanetaTouro3 = new javax.swing.JTextField();
        tfCorTouro3 = new javax.swing.JTextField();
        tfNumerosTouro3 = new javax.swing.JTextField();
        areaCaracteristicas5 = new javax.swing.JPanel();
        pfortesTouro5 = new javax.swing.JLabel();
        tituloCaracteristicaTouro5 = new javax.swing.JLabel();
        pMelhorarTouro5 = new javax.swing.JLabel();
        jScrollPane53 = new javax.swing.JScrollPane();
        txFortesTouro5 = new javax.swing.JTextArea();
        jScrollPane54 = new javax.swing.JScrollPane();
        txMelhorarTouro5 = new javax.swing.JTextArea();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMensagemPeixes = new javax.swing.JButton();
        areaPrevisoePeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numerosSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumerosSagitario = new javax.swing.JTextField();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        pfortesSagitario = new javax.swing.JLabel();
        tituloCaracteristicaSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaInformacoes5 = new javax.swing.JPanel();
        imgSignoTouro4 = new javax.swing.JLabel();
        tituloTouro4 = new javax.swing.JLabel();
        periodoTouro4 = new javax.swing.JLabel();
        elementoTouro4 = new javax.swing.JLabel();
        planetaTouro4 = new javax.swing.JLabel();
        corTouro4 = new javax.swing.JLabel();
        numerosTouro4 = new javax.swing.JLabel();
        tfPeriodoTouro4 = new javax.swing.JTextField();
        tfElementoTouro4 = new javax.swing.JTextField();
        tfPlanetaTouro4 = new javax.swing.JTextField();
        tfCorTouro4 = new javax.swing.JTextField();
        tfNumerosTouro4 = new javax.swing.JTextField();
        areaCaracteristicas6 = new javax.swing.JPanel();
        pfortesTouro6 = new javax.swing.JLabel();
        tituloCaracteristicaTouro6 = new javax.swing.JLabel();
        pMelhorarTouro6 = new javax.swing.JLabel();
        jScrollPane55 = new javax.swing.JScrollPane();
        txFortesTouro6 = new javax.swing.JTextArea();
        jScrollPane56 = new javax.swing.JScrollPane();
        txMelhorarTouro6 = new javax.swing.JTextArea();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMensagemSagitario = new javax.swing.JButton();
        areaPrevisoesSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaInformacoesCarpricornio1 = new javax.swing.JPanel();
        imgSignoCarpricornio = new javax.swing.JLabel();
        tituloCarpricornio1 = new javax.swing.JLabel();
        periodoCarpricornio1 = new javax.swing.JLabel();
        elementoCarpricornio1 = new javax.swing.JLabel();
        planetaCarpricornio1 = new javax.swing.JLabel();
        corCarpricornio1 = new javax.swing.JLabel();
        numerosCarpricornio1 = new javax.swing.JLabel();
        tfPeriodoCarpricornio1 = new javax.swing.JTextField();
        tfElementoCarpricornio1 = new javax.swing.JTextField();
        tfPlanetaCarpricornio1 = new javax.swing.JTextField();
        tfCorCarpricornio1 = new javax.swing.JTextField();
        tfNumerosCarpricornio1 = new javax.swing.JTextField();
        areaCaracteristicasCarpricornio1 = new javax.swing.JPanel();
        pfortesCarpricornio1 = new javax.swing.JLabel();
        tituloCaracteristicaCarpricornio1 = new javax.swing.JLabel();
        pMelhorarCarpricornio1 = new javax.swing.JLabel();
        jScrollPane57 = new javax.swing.JScrollPane();
        txFortesCarpricornio = new javax.swing.JTextArea();
        jScrollPane58 = new javax.swing.JScrollPane();
        txMelhorarCarpricornio = new javax.swing.JTextArea();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaTouro4 = new javax.swing.JLabel();
        amorTouro4 = new javax.swing.JLabel();
        trabalhoTouro4 = new javax.swing.JLabel();
        saudeTouro4 = new javax.swing.JLabel();
        sorteTouro4 = new javax.swing.JLabel();
        tfAmorCarpricornio = new javax.swing.JTextField();
        tfTrabalhoCarpricornio1 = new javax.swing.JTextField();
        tfSaudeCarpricornio1 = new javax.swing.JTextField();
        tfSorteCarpricornio1 = new javax.swing.JTextField();
        areaEnergiaCarpricornio1 = new javax.swing.JPanel();
        tituloEnergiaCarpricornio1 = new javax.swing.JLabel();
        amorCarpricornio1 = new javax.swing.JLabel();
        trabalhoCarpricornio1 = new javax.swing.JLabel();
        saudeCarpricornio1 = new javax.swing.JLabel();
        sorteCarpricornio1 = new javax.swing.JLabel();
        tfAmorTouro5 = new javax.swing.JTextField();
        tfTrabalhoTouro5 = new javax.swing.JTextField();
        tfSaudePeixes2 = new javax.swing.JTextField();
        tfSortePeixes2 = new javax.swing.JTextField();
        areaInformacoes6 = new javax.swing.JPanel();
        imgSignoTouro5 = new javax.swing.JLabel();
        tituloTouro5 = new javax.swing.JLabel();
        periodoTouro5 = new javax.swing.JLabel();
        elementoTouro5 = new javax.swing.JLabel();
        planetaTouro5 = new javax.swing.JLabel();
        corTouro5 = new javax.swing.JLabel();
        numerosTouro5 = new javax.swing.JLabel();
        tfPeriodoTouro5 = new javax.swing.JTextField();
        tfElementoTouro5 = new javax.swing.JTextField();
        tfPlanetaTouro5 = new javax.swing.JTextField();
        tfCorTouro5 = new javax.swing.JTextField();
        tfNumerosTouro5 = new javax.swing.JTextField();
        areaCaracteristicas7 = new javax.swing.JPanel();
        pfortesTouro7 = new javax.swing.JLabel();
        tituloCaracteristicaTouro7 = new javax.swing.JLabel();
        pMelhorarTouro7 = new javax.swing.JLabel();
        jScrollPane59 = new javax.swing.JScrollPane();
        txFortesTouro7 = new javax.swing.JTextArea();
        jScrollPane60 = new javax.swing.JScrollPane();
        txMelhorarTouro7 = new javax.swing.JTextArea();
        areaMensagemCarpricornio1 = new javax.swing.JPanel();
        tituloMensagemCarpricornio1 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txMensagemCarpricornio = new javax.swing.JTextArea();
        btnCopiarMensagemCarpricornio1 = new javax.swing.JButton();
        areaPrevisoeCarpricornio1 = new javax.swing.JPanel();
        previsaoCarpricornio1 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        txPrevisaoCarpricornio = new javax.swing.JTextArea();
        btnAtualizarCarpricornio1 = new javax.swing.JButton();
        fundoCapriconio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signo.setText("     Signo");

        compatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        compatibilidade.setText("           Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(153, 255, 255));

        tfCompatibilidade.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaResultadoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 250, 460));

        descobraSeuSigno.setBackground(new java.awt.Color(0, 204, 204));
        descobraSeuSigno.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        descobraSeuSigno.setForeground(new java.awt.Color(51, 51, 51));
        descobraSeuSigno.setText("    Descubra Seu Signo");

        nome.setBackground(new java.awt.Color(0, 204, 204));
        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome:");

        diaNascimento.setBackground(new java.awt.Color(0, 204, 204));
        diaNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        diaNascimento.setForeground(new java.awt.Color(51, 51, 51));
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setBackground(new java.awt.Color(153, 255, 255));
        btnDescobrirSigno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDescobrirSigno.setText("Descobrir Signo");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descobraSeuSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                            .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mesNascimento)
                                .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addComponent(descobraSeuSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDescobrirSigno)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 240));

        tituloCompatibilidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloCompatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        signo2.setText("Segundo Signo:");

        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setBackground(new java.awt.Color(153, 255, 255));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(tituloCompatibilidade)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 300, 190));

        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Incio", inicio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoes.setBackground(new java.awt.Color(204, 204, 204));

        imgSigno.setBackground(new java.awt.Color(0, 204, 204));
        imgSigno.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSigno.setForeground(new java.awt.Color(51, 51, 51));
        imgSigno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aries.png"))); // NOI18N

        tituloAries.setBackground(new java.awt.Color(0, 204, 204));
        tituloAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloAries.setForeground(new java.awt.Color(51, 51, 51));
        tituloAries.setText("Áries");

        periodoAries.setBackground(new java.awt.Color(0, 204, 204));
        periodoAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoAries.setForeground(new java.awt.Color(51, 51, 51));
        periodoAries.setText("PERIODO:");

        elementoAries.setBackground(new java.awt.Color(0, 204, 204));
        elementoAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoAries.setForeground(new java.awt.Color(51, 51, 51));
        elementoAries.setText("ELEMENTO:");

        planetaAries.setBackground(new java.awt.Color(0, 204, 204));
        planetaAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaAries.setForeground(new java.awt.Color(51, 51, 51));
        planetaAries.setText("PLANETA REGENTE:");

        corAries.setBackground(new java.awt.Color(0, 204, 204));
        corAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corAries.setForeground(new java.awt.Color(51, 51, 51));
        corAries.setText("COR:");

        numerosAries.setBackground(new java.awt.Color(0, 204, 204));
        numerosAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosAries.setForeground(new java.awt.Color(51, 51, 51));
        numerosAries.setText("NÚMERO DA SORTE:");

        tfPeriodoAries.setText("21/03 – 19/04");

        tfElementoAries.setText("Fogo ");

        tfPlanetaAries.setText("Marte  ");
        tfPlanetaAries.addActionListener(this::tfPlanetaAriesActionPerformed);

        tfCorAries.setText(" Vermelho");

        tfNumerosAries.setText("9  ");

        javax.swing.GroupLayout areaInformacoesLayout = new javax.swing.GroupLayout(areaInformacoes);
        areaInformacoes.setLayout(areaInformacoesLayout);
        areaInformacoesLayout.setHorizontalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosAries, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(periodoAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoAries))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(planetaAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPlanetaAries)
                                .addGap(98, 98, 98))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addComponent(elementoAries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLayout.setVerticalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoAries)
                            .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoAries)
                        .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosAries)
                    .addComponent(tfNumerosAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        aries.add(areaInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        tituloMensagemAries1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemAries1.setText("Mensagem do Dia");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        jScrollPane5.setViewportView(txMensagemAries);

        btnCopiarMensagem1.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagem1.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagem1.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagem1Layout = new javax.swing.GroupLayout(areaMensagem1);
        areaMensagem1.setLayout(areaMensagem1Layout);
        areaMensagem1Layout.setHorizontalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGroup(areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagem1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagem1Layout.setVerticalGroup(
            areaMensagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        aries.add(areaMensagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoAries.setText("Previsão do Dia");

        txPrevisaoAries.setColumns(20);
        txPrevisaoAries.setRows(5);
        jScrollPane3.setViewportView(txPrevisaoAries);

        btnAtualizarAries.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarAries.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeLayout = new javax.swing.GroupLayout(areaPrevisoe);
        areaPrevisoe.setLayout(areaPrevisoeLayout);
        areaPrevisoeLayout.setHorizontalGroup(
            areaPrevisoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeLayout.createSequentialGroup()
                        .addComponent(previsaoAries)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(areaPrevisoeLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarAries, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeLayout.setVerticalGroup(
            areaPrevisoeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLayout.createSequentialGroup()
                .addComponent(previsaoAries)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarAries, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        aries.add(areaPrevisoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        pfortesAries.setBackground(new java.awt.Color(0, 204, 204));
        pfortesAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesAries.setForeground(new java.awt.Color(51, 51, 51));
        pfortesAries.setText("Pontos Fortes:");

        tituloCaracteristicaAries.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaAries.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaAries.setText("Características");

        pMelhorarAries.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarAries.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarAries.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa, liderança, determinação e energia");
        jScrollPane1.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText(" Impulsividade, impaciência, agressividade, teimosia e dificuldade em esperar.");
        jScrollPane2.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasLayout = new javax.swing.GroupLayout(areaCaracteristicas);
        areaCaracteristicas.setLayout(areaCaracteristicasLayout);
        areaCaracteristicasLayout.setHorizontalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesAries)
                            .addComponent(pMelhorarAries)
                            .addComponent(tituloCaracteristicaAries))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasLayout.setVerticalGroup(
            areaCaracteristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        aries.add(areaCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaAries.setText("Energia do Dia");

        amorAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteAries.setText("Sorte:");

        tfAmorAries.setText("78%");

        tfTrabalhoAries.setText("88%");

        tfSaudeAries.setText("82%");

        tfSorteAries.setText("75%");

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorAries)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoAries)
                    .addComponent(amorAries))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoAries)
                    .addComponent(tfSorteAries)
                    .addComponent(tfSaudeAries)
                    .addGroup(areaEnergiaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaAries)
                            .addComponent(saudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sorteAries))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAries)
                .addGap(18, 18, 18)
                .addComponent(amorAries)
                .addGap(4, 4, 4)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        aries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 440, 310));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        fundoAries.setText("jLabel3");
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 2411, -1));

        areaAbas.addTab("Áries", aries);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAquario.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoAquario.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoAquario.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoAquario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aquario.png"))); // NOI18N

        tituloAries1.setBackground(new java.awt.Color(0, 204, 204));
        tituloAries1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloAries1.setForeground(new java.awt.Color(51, 51, 51));
        tituloAries1.setText("Aquário");

        periodoAquario.setBackground(new java.awt.Color(0, 204, 204));
        periodoAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoAquario.setForeground(new java.awt.Color(51, 51, 51));
        periodoAquario.setText("PERIODO:");

        elementoAquario.setBackground(new java.awt.Color(0, 204, 204));
        elementoAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoAquario.setForeground(new java.awt.Color(51, 51, 51));
        elementoAquario.setText("ELEMENTO:");

        planetaAquario.setBackground(new java.awt.Color(0, 204, 204));
        planetaAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaAquario.setForeground(new java.awt.Color(51, 51, 51));
        planetaAquario.setText("PLANETA REGENTE:");

        corAquario.setBackground(new java.awt.Color(0, 204, 204));
        corAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corAquario.setForeground(new java.awt.Color(51, 51, 51));
        corAquario.setText("COR:");

        numerosAquario.setBackground(new java.awt.Color(0, 204, 204));
        numerosAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosAquario.setForeground(new java.awt.Color(51, 51, 51));
        numerosAquario.setText("NÚMERO DA SORTE:");

        tfPeriodoAquario.setText("20/01 – 18/02 ");

        tfElementoAquario.setText(" Ar ");

        tfPlanetaAquario.setText("Urano");
        tfPlanetaAquario.addActionListener(this::tfPlanetaAquarioActionPerformed);

        tfCorAquario.setText("Azul   ");

        tfNumerosAquario.setText(" 4  ");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(periodoAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoAquario))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(planetaAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(elementoAquario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfElementoAquario)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addComponent(tituloAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoAquario)
                            .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoAquario)
                        .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosAquario)
                    .addComponent(tfNumerosAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemAquario.setText("Mensagem do Dia");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        jScrollPane6.setViewportView(txMensagemAquario);

        btnCopiarMensagemAquario.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoAquario.setText("Previsão do Dia");

        txPrevisaoAquario.setColumns(20);
        txPrevisaoAquario.setRows(5);
        jScrollPane4.setViewportView(txPrevisaoAquario);

        btnAtualizarAquario.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeAquarioLayout = new javax.swing.GroupLayout(areaPrevisoeAquario);
        areaPrevisoeAquario.setLayout(areaPrevisoeAquarioLayout);
        areaPrevisoeAquarioLayout.setHorizontalGroup(
            areaPrevisoeAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeAquarioLayout.createSequentialGroup()
                        .addComponent(previsaoAquario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
            .addGroup(areaPrevisoeAquarioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeAquarioLayout.setVerticalGroup(
            areaPrevisoeAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeAquarioLayout.createSequentialGroup()
                .addComponent(previsaoAquario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        aquario.add(areaPrevisoeAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        pfortesAquario.setBackground(new java.awt.Color(0, 204, 204));
        pfortesAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesAquario.setForeground(new java.awt.Color(51, 51, 51));
        pfortesAquario.setText("Pontos Fortes:");

        tituloCaracteristicaAquario.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaAquario.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaAquario.setText("Características");

        pMelhorarAquario.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarAquario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarAquario.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText("Criatividade, independência, originalidade, inteligência e visão de futuro");
        jScrollPane19.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText("teimosia, distanciamento emocional, imprevisibilidade, rebeldia e dificuldade em seguir regras");
        jScrollPane20.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane20)
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesAquario)
                            .addComponent(pMelhorarAquario)
                            .addComponent(tituloCaracteristicaAquario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaAquario.setText("Energia do Dia");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteAquario.setText("Sorte:");

        tfAmorAquario.setText("65%");

        tfTrabalhoAquario.setText("88%");

        tfSaudeAquario.setText("70%");

        tfSorteAquario.setText("90%");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorAquario)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoAquario)
                    .addComponent(amorAquario))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoAquario)
                    .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaAquario)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSorteAquario)
                    .addComponent(tfSaudeAquario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteAquario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAquario)
                .addGap(18, 18, 18)
                .addComponent(amorAquario)
                .addGap(4, 4, 4)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAquario)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 440, 310));

        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCancer.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoCancer.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoCancer.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\cancer.png")); // NOI18N

        tituloCancer.setBackground(new java.awt.Color(0, 204, 204));
        tituloCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCancer.setForeground(new java.awt.Color(51, 51, 51));
        tituloCancer.setText("Câncer");

        periodoCancer.setBackground(new java.awt.Color(0, 204, 204));
        periodoCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoCancer.setForeground(new java.awt.Color(51, 51, 51));
        periodoCancer.setText("PERIODO:");

        elementoCancer.setBackground(new java.awt.Color(0, 204, 204));
        elementoCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoCancer.setForeground(new java.awt.Color(51, 51, 51));
        elementoCancer.setText("ELEMENTO:");

        planetaCancer.setBackground(new java.awt.Color(0, 204, 204));
        planetaCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaCancer.setForeground(new java.awt.Color(51, 51, 51));
        planetaCancer.setText("PLANETA REGENTE:");

        corCancer.setBackground(new java.awt.Color(0, 204, 204));
        corCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corCancer.setForeground(new java.awt.Color(51, 51, 51));
        corCancer.setText("COR:");

        numerosCancer.setBackground(new java.awt.Color(0, 204, 204));
        numerosCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosCancer.setForeground(new java.awt.Color(51, 51, 51));
        numerosCancer.setText("NÚMERO DA SORTE:");

        tfPeriodoCancer.setText("21/06 – 22/07");

        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setText("Lua    ");
        tfPlanetaCancer.addActionListener(this::tfPlanetaCancerActionPerformed);

        tfCorCancer.setText("Branco/Prata");

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addComponent(periodoCancer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoCancer))
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                                        .addComponent(planetaCancer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaCancer))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCancerLayout.createSequentialGroup()
                                        .addComponent(elementoCancer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoCancer)
                            .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoCancer)
                        .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosCancer)
                    .addComponent(tfNumerosCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesCancer.setBackground(new java.awt.Color(0, 204, 204));
        pfortesCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesCancer.setForeground(new java.awt.Color(51, 51, 51));
        pfortesCancer.setText("Pontos Fortes:");

        tituloCaracteristicaCancer.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaCancer.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaCancer.setText("Características");

        pMelhorarCancer.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarCancer.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarCancer.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("sensibilidade, empatia, proteção, lealdade e forte vínculo familiar");
        jScrollPane41.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("perfeccionismo, excesso de crítica, preocupação, rigidez e dificuldade em relaxar");
        jScrollPane42.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane42)
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesCancer)
                            .addComponent(pMelhorarCancer)
                            .addComponent(tituloCaracteristicaCancer))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCancer.setText("Previsão do Dia");

        txPrevisaoCancer.setColumns(20);
        txPrevisaoCancer.setRows(5);
        jScrollPane10.setViewportView(txPrevisaoCancer);

        btnAtualizarCancer.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeCancerLayout = new javax.swing.GroupLayout(areaPrevisoeCancer);
        areaPrevisoeCancer.setLayout(areaPrevisoeCancerLayout);
        areaPrevisoeCancerLayout.setHorizontalGroup(
            areaPrevisoeCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                .addGroup(areaPrevisoeCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                        .addGroup(areaPrevisoeCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnAtualizarCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(previsaoCancer)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaPrevisoeCancerLayout.setVerticalGroup(
            areaPrevisoeCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeCancerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(previsaoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        cancer.add(areaPrevisoeCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaCancer.setText("Energia do Dia");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteCancer.setText("Sorte:");

        tfAmorCancer.setText("92%");

        tfTrabalhoCancer.setText("70%");

        tfSaudeCancer.setText("68%");

        tfSorteCancer.setText("78%");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorCancer)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addComponent(amorCancer)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteCancer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoCancer)
                    .addComponent(tfSorteCancer)
                    .addComponent(tfSaudeCancer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                        .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaCancer))
                            .addComponent(trabalhoCancer))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCancer)
                .addGap(18, 18, 18)
                .addComponent(amorCancer)
                .addGap(4, 4, 4)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCancer)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemCancer.setText("Mensagem do Dia");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        jScrollPane9.setViewportView(txMensagemCancer);

        btnCopiarMensagemCancer.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9)))
                .addContainerGap())
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        cancer.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesGemeos.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoGemeos.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoGemeos.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\gemeos.png")); // NOI18N

        tituloGemeos.setBackground(new java.awt.Color(0, 204, 204));
        tituloGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloGemeos.setForeground(new java.awt.Color(51, 51, 51));
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setBackground(new java.awt.Color(0, 204, 204));
        periodoGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoGemeos.setForeground(new java.awt.Color(51, 51, 51));
        periodoGemeos.setText("PERIODO:");

        elementoGemeos.setBackground(new java.awt.Color(0, 204, 204));
        elementoGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoGemeos.setForeground(new java.awt.Color(51, 51, 51));
        elementoGemeos.setText("ELEMENTO:");

        planetaGemeos.setBackground(new java.awt.Color(0, 204, 204));
        planetaGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaGemeos.setForeground(new java.awt.Color(51, 51, 51));
        planetaGemeos.setText("PLANETA REGENTE:");

        corGemeos.setBackground(new java.awt.Color(0, 204, 204));
        corGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corGemeos.setForeground(new java.awt.Color(51, 51, 51));
        corGemeos.setText("COR:");

        numerosGemeos.setBackground(new java.awt.Color(0, 204, 204));
        numerosGemeos.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosGemeos.setForeground(new java.awt.Color(51, 51, 51));
        numerosGemeos.setText("NÚMERO DA SORTE:");

        tfPeriodoGemeos.setText("21/05 – 20/06 ");

        tfElementoGemeos.setText("Ar");

        tfPlanetaGemeos.setText("Mercúrio");
        tfPlanetaGemeos.addActionListener(this::tfPlanetaGemeosActionPerformed);

        tfCorGemeos.setText("Amarelo");

        tfNumerosGemeos.setText("5  ");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(periodoGemeos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoGemeos))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                                        .addComponent(planetaGemeos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaGemeos))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesGemeosLayout.createSequentialGroup()
                                        .addComponent(elementoGemeos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(corGemeos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(numerosGemeos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoGemeos)
                            .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoGemeos)
                        .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosGemeos)
                    .addComponent(tfNumerosGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesGemeos1.setBackground(new java.awt.Color(0, 204, 204));
        pfortesGemeos1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesGemeos1.setForeground(new java.awt.Color(51, 51, 51));
        pfortesGemeos1.setText("Pontos Fortes:");

        tituloCaracteristicaGemeos1.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaGemeos1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaGemeos1.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaGemeos1.setText("Características");

        pMelhorarGemeos1.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarGemeos1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarGemeos1.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarGemeos1.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("comunicação, inteligência, curiosidade, criatividade e adaptabilidade");
        jScrollPane43.setViewportView(txFortesGemeos);

        txMelhorarGemeos1.setColumns(20);
        txMelhorarGemeos1.setRows(5);
        txMelhorarGemeos1.setText(" inconstância, ansiedade, dispersão, superficialidade e indecisão. ");
        jScrollPane44.setViewportView(txMelhorarGemeos1);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesGemeos1)
                            .addComponent(pMelhorarGemeos1)
                            .addComponent(tituloCaracteristicaGemeos1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesGemeos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoGemeos1.setText("Previsão do Dia");

        txPrevisaoGemeos.setColumns(20);
        txPrevisaoGemeos.setRows(5);
        jScrollPane11.setViewportView(txPrevisaoGemeos);

        btnAtualizarGemeos1.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarGemeos1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarGemeos1.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeGemeosLayout = new javax.swing.GroupLayout(areaPrevisoeGemeos);
        areaPrevisoeGemeos.setLayout(areaPrevisoeGemeosLayout);
        areaPrevisoeGemeosLayout.setHorizontalGroup(
            areaPrevisoeGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeGemeosLayout.createSequentialGroup()
                        .addComponent(previsaoGemeos1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane11))
                .addContainerGap())
            .addGroup(areaPrevisoeGemeosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeGemeosLayout.setVerticalGroup(
            areaPrevisoeGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeGemeosLayout.createSequentialGroup()
                .addComponent(previsaoGemeos1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        gemeos.add(areaPrevisoeGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaGemeos1.setText("Energia do Dia");

        amorGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorGemeos1.setText("Amor:");

        trabalhoGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoGemeos1.setText("Trabalho:");

        saudeGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeGemeos1.setText("Saúde:");

        sorteGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteGemeos1.setText("Sorte:");

        tfAmorGemeos1.setText("72%");

        tfTrabalhoGemeos1.setText("85%");

        tfSaudeGemeos1.setText("65%");

        tfSorteGemeos.setText("80%");

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorGemeos1)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addComponent(amorGemeos1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteGemeos1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoGemeos1)
                    .addComponent(tfSorteGemeos)
                    .addComponent(tfSaudeGemeos1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                        .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaGemeos1))
                            .addComponent(trabalhoGemeos1))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaGemeos1)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos1)
                .addGap(4, 4, 4)
                .addComponent(tfAmorGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoGemeos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeGemeos1)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteGemeos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemGemeos1.setText("Mensagem do Dia");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        jScrollPane12.setViewportView(txMensagemGemeos);

        btnCopiarMensagemGemeos1.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemGemeos1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemGemeos1.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemGemeos1.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12)))
                .addContainerGap())
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemGemeos1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        gemeos.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLeao.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoLeao.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoLeao.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leao.png")); // NOI18N

        tituloLeao.setBackground(new java.awt.Color(0, 204, 204));
        tituloLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloLeao.setForeground(new java.awt.Color(51, 51, 51));
        tituloLeao.setText("Leão");

        periodoLeao.setBackground(new java.awt.Color(0, 204, 204));
        periodoLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoLeao.setForeground(new java.awt.Color(51, 51, 51));
        periodoLeao.setText("PERIODO:");

        elementoLeao.setBackground(new java.awt.Color(0, 204, 204));
        elementoLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoLeao.setForeground(new java.awt.Color(51, 51, 51));
        elementoLeao.setText("ELEMENTO:");

        planetaLeao.setBackground(new java.awt.Color(0, 204, 204));
        planetaLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaLeao.setForeground(new java.awt.Color(51, 51, 51));
        planetaLeao.setText("PLANETA REGENTE:");

        corLeao.setBackground(new java.awt.Color(0, 204, 204));
        corLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corLeao.setForeground(new java.awt.Color(51, 51, 51));
        corLeao.setText("COR:");

        numerosLeao.setBackground(new java.awt.Color(0, 204, 204));
        numerosLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosLeao.setForeground(new java.awt.Color(51, 51, 51));
        numerosLeao.setText("NÚMERO DA SORTE:");

        tfPeriodoLeao.setText(" 23/07 – 22/08");

        tfElementoLeao.setText("Fogo ");

        tfPlanetaLeao.setText("Sol   ");
        tfPlanetaLeao.addActionListener(this::tfPlanetaLeaoActionPerformed);

        tfCorLeao.setText(" Dourado   ");

        tfNumerosLeao.setText("1 ");

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addComponent(periodoLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoLeao))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                                        .addComponent(planetaLeao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaLeao))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(elementoLeao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosLeao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tituloLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoLeao)
                            .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoLeao)
                        .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosLeao)
                    .addComponent(tfNumerosLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesLeao.setBackground(new java.awt.Color(0, 204, 204));
        pfortesLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesLeao.setForeground(new java.awt.Color(51, 51, 51));
        pfortesLeao.setText("Pontos Fortes:");

        tituloCaracteristicaLeao.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaLeao.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaLeao.setText("Características");

        pMelhorarLeao.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarLeao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarLeao.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("liderança, confiança, criatividade, generosidade e entusiasmo.");
        jScrollPane45.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("orgulho, necessidade de reconhecimento, autoritarismo, vaidade e dificuldade em aceitar críticas.");
        jScrollPane46.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane46)
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesLeao)
                            .addComponent(pMelhorarLeao)
                            .addComponent(tituloCaracteristicaLeao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLeao.setText("Previsão do Dia");

        txPrevisaoLeao.setColumns(20);
        txPrevisaoLeao.setRows(5);
        jScrollPane13.setViewportView(txPrevisaoLeao);

        btnAtualizarLeao.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarLeao.setText("Atualizar Previsão");
        btnAtualizarLeao.addActionListener(this::btnAtualizarLeaoActionPerformed);

        javax.swing.GroupLayout areaPrevisoeLeaoLayout = new javax.swing.GroupLayout(areaPrevisoeLeao);
        areaPrevisoeLeao.setLayout(areaPrevisoeLeaoLayout);
        areaPrevisoeLeaoLayout.setHorizontalGroup(
            areaPrevisoeLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeLeaoLayout.createSequentialGroup()
                        .addComponent(previsaoLeao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13))
                .addContainerGap())
            .addGroup(areaPrevisoeLeaoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeLeaoLayout.setVerticalGroup(
            areaPrevisoeLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLeaoLayout.createSequentialGroup()
                .addComponent(previsaoLeao)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        leao.add(areaPrevisoeLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaLeao.setText("Energia do Dia");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteLeao.setText("Sorte:");

        tfAmorLeao.setText("88%");

        tfTrabalhoLeao.setText("90%");

        tfSaudeLeao.setText("80%");

        tfSorteLeao.setText("85%");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorLeao)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addComponent(amorLeao)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSorteLeao)
                    .addComponent(tfSaudeLeao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTrabalhoLeao)
                    .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaLeao))
                            .addComponent(trabalhoLeao)
                            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sorteLeao))))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLeao)
                .addGap(18, 18, 18)
                .addComponent(amorLeao)
                .addGap(4, 4, 4)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLeao)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemLeao.setText("Mensagem do Dia");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        jScrollPane14.setViewportView(txMensagemLeao);

        btnCopiarMensagemLeao.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14)))
                .addContainerGap())
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesVirgem.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoVirgem.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgem.png")); // NOI18N

        tituloVirgem.setBackground(new java.awt.Color(0, 204, 204));
        tituloVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tituloVirgem.setText("Virgem");

        periodoVirgem.setBackground(new java.awt.Color(0, 204, 204));
        periodoVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        periodoVirgem.setText("PERIODO:");

        elementoVirgem.setBackground(new java.awt.Color(0, 204, 204));
        elementoVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoVirgem.setForeground(new java.awt.Color(51, 51, 51));
        elementoVirgem.setText("ELEMENTO:");

        planetaVirgem.setBackground(new java.awt.Color(0, 204, 204));
        planetaVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaVirgem.setForeground(new java.awt.Color(51, 51, 51));
        planetaVirgem.setText("PLANETA REGENTE:");

        corVirgem.setBackground(new java.awt.Color(0, 204, 204));
        corVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corVirgem.setForeground(new java.awt.Color(51, 51, 51));
        corVirgem.setText("COR:");

        numerosVirgem.setBackground(new java.awt.Color(0, 204, 204));
        numerosVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosVirgem.setForeground(new java.awt.Color(51, 51, 51));
        numerosVirgem.setText("NÚMERO DA SORTE:");

        tfPeriodoVirgem.setText(" 23/08 – 22/09");

        tfElementoVirgem.setText("Terra ");

        tfPlanetaVirgem.setText("Mercúrio");
        tfPlanetaVirgem.addActionListener(this::tfPlanetaVirgemActionPerformed);

        tfCorVirgem.setText(" Verde ");

        tfNumerosVirgem.setText(" 5");

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addComponent(periodoVirgem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoVirgem))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                                        .addComponent(planetaVirgem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaVirgem))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                                        .addComponent(elementoVirgem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corVirgem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosVirgem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tituloVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoVirgem)
                            .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoVirgem)
                        .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosVirgem)
                    .addComponent(tfNumerosVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesVirgem.setBackground(new java.awt.Color(0, 204, 204));
        pfortesVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesVirgem.setForeground(new java.awt.Color(51, 51, 51));
        pfortesVirgem.setText("Pontos Fortes:");

        tituloCaracteristicaVirgem.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaVirgem.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaVirgem.setText("Características");

        pMelhorarVirgem.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarVirgem.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarVirgem.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText(" organização, inteligência, atenção aos detalhes, responsabilidade e praticidade.");
        jScrollPane47.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("perfeccionismo, excesso de crítica, preocupação, rigidez e dificuldade em relaxar.");
        jScrollPane48.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesVirgem)
                            .addComponent(pMelhorarVirgem)
                            .addComponent(tituloCaracteristicaVirgem))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoVirgem.setText("Previsão do Dia");

        txPrevisaoVirgem.setColumns(20);
        txPrevisaoVirgem.setRows(5);
        jScrollPane15.setViewportView(txPrevisaoVirgem);

        btnAtualizarVirgem.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeVirgemLayout = new javax.swing.GroupLayout(areaPrevisoeVirgem);
        areaPrevisoeVirgem.setLayout(areaPrevisoeVirgemLayout);
        areaPrevisoeVirgemLayout.setHorizontalGroup(
            areaPrevisoeVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeVirgemLayout.createSequentialGroup()
                        .addComponent(previsaoVirgem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane15))
                .addContainerGap())
            .addGroup(areaPrevisoeVirgemLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeVirgemLayout.setVerticalGroup(
            areaPrevisoeVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeVirgemLayout.createSequentialGroup()
                .addComponent(previsaoVirgem)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        virgem.add(areaPrevisoeVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaVirgem.setText("Energia do Dia");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteVirgem.setText("Sorte:");

        tfAmorVirgem.setText("75%");

        tfTrabalhoVirgem.setText("95%");

        tfSaudeVirgem.setText("72%");

        tfSorteVirgem.setText("70%");

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorVirgem)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addComponent(amorVirgem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSorteVirgem)
                    .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTrabalhoVirgem)
                    .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                        .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaVirgem))
                            .addComponent(trabalhoVirgem)
                            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sorteVirgem))))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaVirgem)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem)
                .addGap(4, 4, 4)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saudeVirgem)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem do Dia");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        jScrollPane16.setViewportView(txMensagemVirgem);

        btnCopiarMensagemVirgem.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane16)))
                .addContainerGap())
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLibra.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoLibra.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoLibra.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoLibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libra.png"))); // NOI18N

        tituloLibra.setBackground(new java.awt.Color(0, 204, 204));
        tituloLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloLibra.setForeground(new java.awt.Color(51, 51, 51));
        tituloLibra.setText("Libra");

        periodoLibra.setBackground(new java.awt.Color(0, 204, 204));
        periodoLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoLibra.setForeground(new java.awt.Color(51, 51, 51));
        periodoLibra.setText("PERIODO:");

        elementoLibra.setBackground(new java.awt.Color(0, 204, 204));
        elementoLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoLibra.setForeground(new java.awt.Color(51, 51, 51));
        elementoLibra.setText("ELEMENTO:");

        planetaLibra.setBackground(new java.awt.Color(0, 204, 204));
        planetaLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaLibra.setForeground(new java.awt.Color(51, 51, 51));
        planetaLibra.setText("PLANETA REGENTE:");

        corLibra.setBackground(new java.awt.Color(0, 204, 204));
        corLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corLibra.setForeground(new java.awt.Color(51, 51, 51));
        corLibra.setText("COR:");

        numerosLibra.setBackground(new java.awt.Color(0, 204, 204));
        numerosLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosLibra.setForeground(new java.awt.Color(51, 51, 51));
        numerosLibra.setText("NÚMERO DA SORTE:");

        tfPeriodoLibra.setText("23/09 – 22/10");

        tfElementoLibra.setText("Ar ");

        tfPlanetaLibra.setText("Vênus   ");
        tfPlanetaLibra.addActionListener(this::tfPlanetaLibraActionPerformed);

        tfCorLibra.setText("Rosa/Azul-claro ");

        tfNumerosLibra.setText("6 ");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addComponent(periodoLibra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoLibra))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(planetaLibra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaLibra))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(elementoLibra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corLibra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosLibra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoLibra)
                            .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoLibra)
                        .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosLibra)
                    .addComponent(tfNumerosLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesLibra.setBackground(new java.awt.Color(0, 204, 204));
        pfortesLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesLibra.setForeground(new java.awt.Color(51, 51, 51));
        pfortesLibra.setText("Pontos Fortes:");

        tituloCaracteristicaLibra.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaLibra.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaLibra.setText("Características");

        pMelhorarLibra.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarLibra.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarLibra.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("diplomacia, sociabilidade, justiça, charme e capacidade de conciliação.");
        jScrollPane49.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText(" indecisão, necessidade de aprovação, evitar conflitos excessivamente e dificuldade em tomar decisões.");
        jScrollPane50.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasvLayout = new javax.swing.GroupLayout(areaCaracteristicasv);
        areaCaracteristicasv.setLayout(areaCaracteristicasvLayout);
        areaCaracteristicasvLayout.setHorizontalGroup(
            areaCaracteristicasvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasvLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pMelhorarLibra)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(areaCaracteristicasvLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(jScrollPane50)
                            .addGroup(areaCaracteristicasvLayout.createSequentialGroup()
                                .addGroup(areaCaracteristicasvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfortesLibra)
                                    .addComponent(tituloCaracteristicaLibra))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        areaCaracteristicasvLayout.setVerticalGroup(
            areaCaracteristicasvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        libra.add(areaCaracteristicasv, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLibra.setText("Previsão do Dia");

        txPrevisaoLibra.setColumns(20);
        txPrevisaoLibra.setRows(5);
        jScrollPane17.setViewportView(txPrevisaoLibra);

        btnAtualizarLibra.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarLibra.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeLibraLayout = new javax.swing.GroupLayout(areaPrevisoeLibra);
        areaPrevisoeLibra.setLayout(areaPrevisoeLibraLayout);
        areaPrevisoeLibraLayout.setHorizontalGroup(
            areaPrevisoeLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeLibraLayout.createSequentialGroup()
                        .addComponent(previsaoLibra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane17))
                .addContainerGap())
            .addGroup(areaPrevisoeLibraLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeLibraLayout.setVerticalGroup(
            areaPrevisoeLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeLibraLayout.createSequentialGroup()
                .addComponent(previsaoLibra)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        libra.add(areaPrevisoeLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaLibra.setText("Energia do Dia");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorLibra.setText("Amor:");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeLibra.setText("Saúde:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteLibra.setText("Sorte:");

        tfAmorLibra.setText("90%");

        tfTrabalhoLibra.setText("80%");

        tfSaudeLibra.setText("70%");

        tfSorteLibra.setText("82%");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorLibra)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addComponent(amorLibra)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSorteLibra)
                    .addComponent(tfSaudeLibra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTrabalhoLibra)
                    .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                        .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaLibra))
                            .addComponent(trabalhoLibra)
                            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sorteLibra))))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLibra)
                .addGap(18, 18, 18)
                .addComponent(amorLibra)
                .addGap(4, 4, 4)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saudeLibra)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemLibra.setText("Mensagem do Dia");

        txMensagemLibra.setColumns(20);
        txMensagemLibra.setRows(5);
        jScrollPane18.setViewportView(txMensagemLibra);

        btnCopiarMensagemLibra.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane18)))
                .addContainerGap())
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Libra", libra);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesTouro.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoTouro.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoTouro.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro.setBackground(new java.awt.Color(0, 204, 204));
        tituloTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloTouro.setForeground(new java.awt.Color(51, 51, 51));
        tituloTouro.setText("Touro");

        periodoTouro.setBackground(new java.awt.Color(0, 204, 204));
        periodoTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoTouro.setForeground(new java.awt.Color(51, 51, 51));
        periodoTouro.setText("PERIODO:");

        elementoTouro.setBackground(new java.awt.Color(0, 204, 204));
        elementoTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoTouro.setForeground(new java.awt.Color(51, 51, 51));
        elementoTouro.setText("ELEMENTO:");

        planetaTouro.setBackground(new java.awt.Color(0, 204, 204));
        planetaTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaTouro.setForeground(new java.awt.Color(51, 51, 51));
        planetaTouro.setText("PLANETA REGENTE:");

        corTouro.setBackground(new java.awt.Color(0, 204, 204));
        corTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corTouro.setForeground(new java.awt.Color(51, 51, 51));
        corTouro.setText("COR:");

        numerosTouro.setBackground(new java.awt.Color(0, 204, 204));
        numerosTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosTouro.setForeground(new java.awt.Color(51, 51, 51));
        numerosTouro.setText("NÚMERO DA SORTE:");

        tfPeriodoTouro.setText(" 20/04 – 20/05 ");

        tfElementoTouro.setText(" Terra");

        tfPlanetaTouro.setText("Vênus  ");
        tfPlanetaTouro.addActionListener(this::tfPlanetaTouroActionPerformed);

        tfCorTouro.setText("Verde    ");

        tfNumerosTouro.setText(" 6     ");

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addComponent(periodoTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro))
                            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                        .addComponent(planetaTouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaTouro))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                        .addComponent(elementoTouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                        .addComponent(tituloTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoTouro)
                            .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoTouro)
                        .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosTouro)
                    .addComponent(tfNumerosTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesTouro.setBackground(new java.awt.Color(0, 204, 204));
        pfortesTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesTouro.setForeground(new java.awt.Color(51, 51, 51));
        pfortesTouro.setText("Pontos Fortes:");

        tituloCaracteristicaTouro.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaTouro.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaTouro.setText("Características");

        pMelhorarTouro.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarTouro.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarTouro.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("lealdade, estabilidade, determinação, paciência e praticidade.");
        jScrollPane31.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("teimosia, possessividade, resistência a mudanças e apego excessivo ao conforto.");
        jScrollPane32.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane32)
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesTouro)
                            .addComponent(pMelhorarTouro)
                            .addComponent(tituloCaracteristicaTouro))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        tituloEnergiaTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaTouro.setText("Energia do Dia");

        amorTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorTouro.setText("Amor:");

        trabalhoTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoTouro.setText("Trabalho:");

        saudeTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeTouro.setText("Saúde:");

        sorteTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteTouro.setText("Sorte:");

        tfAmorTouro.setText("85%");

        tfTrabalhoTouro.setText("90%");

        tfSaudeTouro.setText("70%");

        tfSorteTouro.setText("80%");

        tituloEnergiaTouro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaTouro1.setText("Energia do Dia");

        amorTouro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorTouro1.setText("Amor:");

        trabalhoTouro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoTouro1.setText("Trabalho:");

        saudeTouro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeTouro1.setText("Saúde:");

        sorteTouro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteTouro1.setText("Sorte:");

        areaInformacoes3.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoTouro2.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoTouro2.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoTouro2.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro2.setBackground(new java.awt.Color(0, 204, 204));
        tituloTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloTouro2.setForeground(new java.awt.Color(51, 51, 51));
        tituloTouro2.setText("Touro");

        periodoTouro2.setBackground(new java.awt.Color(0, 204, 204));
        periodoTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoTouro2.setForeground(new java.awt.Color(51, 51, 51));
        periodoTouro2.setText("PERIODO:");

        elementoTouro2.setBackground(new java.awt.Color(0, 204, 204));
        elementoTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoTouro2.setForeground(new java.awt.Color(51, 51, 51));
        elementoTouro2.setText("ELEMENTO:");

        planetaTouro2.setBackground(new java.awt.Color(0, 204, 204));
        planetaTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaTouro2.setForeground(new java.awt.Color(51, 51, 51));
        planetaTouro2.setText("PLANETA REGENTE:");

        corTouro2.setBackground(new java.awt.Color(0, 204, 204));
        corTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corTouro2.setForeground(new java.awt.Color(51, 51, 51));
        corTouro2.setText("COR:");

        numerosTouro2.setBackground(new java.awt.Color(0, 204, 204));
        numerosTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosTouro2.setForeground(new java.awt.Color(51, 51, 51));
        numerosTouro2.setText("NÚMERO DA SORTE:");

        tfPlanetaTouro2.addActionListener(this::tfPlanetaTouro2ActionPerformed);

        javax.swing.GroupLayout areaInformacoes3Layout = new javax.swing.GroupLayout(areaInformacoes3);
        areaInformacoes3.setLayout(areaInformacoes3Layout);
        areaInformacoes3Layout.setHorizontalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corTouro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosTouro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addComponent(periodoTouro2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro2))
                            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(planetaTouro2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaTouro2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes3Layout.createSequentialGroup()
                                        .addComponent(elementoTouro2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoes3Layout.setVerticalGroup(
            areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes3Layout.createSequentialGroup()
                        .addComponent(tituloTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoTouro2)
                            .addComponent(tfPeriodoTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoTouro2)
                        .addComponent(tfElementoTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro2)
                    .addComponent(tfPlanetaTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro2)
                    .addComponent(tfCorTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoes3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosTouro2)
                    .addComponent(tfNumerosTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfortesTouro2.setBackground(new java.awt.Color(0, 204, 204));
        pfortesTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesTouro2.setForeground(new java.awt.Color(51, 51, 51));
        pfortesTouro2.setText("Pontos Fortes:");

        tituloCaracteristicaTouro2.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaTouro2.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaTouro2.setText("Características");

        pMelhorarTouro2.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarTouro2.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarTouro2.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarTouro2.setText("Pontos a Melhorar:");

        txFortesTouro2.setColumns(20);
        txFortesTouro2.setRows(5);
        jScrollPane35.setViewportView(txFortesTouro2);

        txMelhorarTouro2.setColumns(20);
        txMelhorarTouro2.setRows(5);
        jScrollPane36.setViewportView(txMelhorarTouro2);

        javax.swing.GroupLayout areaCaracteristicas3Layout = new javax.swing.GroupLayout(areaCaracteristicas3);
        areaCaracteristicas3.setLayout(areaCaracteristicas3Layout);
        areaCaracteristicas3Layout.setHorizontalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                        .addGroup(areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesTouro2)
                            .addComponent(pMelhorarTouro2)
                            .addComponent(tituloCaracteristicaTouro2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicas3Layout.setVerticalGroup(
            areaCaracteristicas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesTouro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout areaEnergiaTouro1Layout = new javax.swing.GroupLayout(areaEnergiaTouro1);
        areaEnergiaTouro1.setLayout(areaEnergiaTouro1Layout);
        areaEnergiaTouro1Layout.setHorizontalGroup(
            areaEnergiaTouro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorTouro1)
            .addGroup(areaEnergiaTouro1Layout.createSequentialGroup()
                .addGroup(areaEnergiaTouro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoTouro1)
                    .addComponent(amorTouro1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaTouro1Layout.createSequentialGroup()
                .addGroup(areaEnergiaTouro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoTouro1)
                    .addGroup(areaEnergiaTouro1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaTouro1)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSorteTouro1)
                    .addComponent(tfSaudeTouro1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaTouro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaTouro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteTouro1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaTouro1Layout.setVerticalGroup(
            areaEnergiaTouro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro1)
                .addGap(18, 18, 18)
                .addComponent(amorTouro1)
                .addGap(4, 4, 4)
                .addComponent(tfAmorTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro1)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorTouro)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoTouro)
                    .addComponent(amorTouro))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoTouro)
                    .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaTouro)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSorteTouro)
                    .addComponent(tfSaudeTouro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteTouro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro)
                .addGap(18, 18, 18)
                .addComponent(amorTouro)
                .addGap(4, 4, 4)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 440, 310));

        tituloMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemTouro.setText("Mensagem do Dia");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        jScrollPane7.setViewportView(txMensagemTouro);

        btnCopiarMensagemTouro.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemTouro.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7)))
                .addContainerGap())
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        previsaoTouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoTouro.setText("Previsão do Dia");

        txPrevisaoTouro.setColumns(20);
        txPrevisaoTouro.setRows(5);
        jScrollPane8.setViewportView(txPrevisaoTouro);

        btnAtualizarTouro.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarTouro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarTouro.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarTouro.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeTouroLayout = new javax.swing.GroupLayout(areaPrevisoeTouro);
        areaPrevisoeTouro.setLayout(areaPrevisoeTouroLayout);
        areaPrevisoeTouroLayout.setHorizontalGroup(
            areaPrevisoeTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeTouroLayout.createSequentialGroup()
                        .addComponent(previsaoTouro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
            .addGroup(areaPrevisoeTouroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeTouroLayout.setVerticalGroup(
            areaPrevisoeTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeTouroLayout.createSequentialGroup()
                .addComponent(previsaoTouro)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        touro.add(areaPrevisoeTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Touro", touro);

        escorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesEscorpiao.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpiao.png")); // NOI18N

        tituloEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        tituloEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        periodoEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        periodoEscorpiao.setText("PERIODO:");

        elementoEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        elementoEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        elementoEscorpiao.setText("ELEMENTO:");

        planetaEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        planetaEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        planetaEscorpiao.setText("PLANETA REGENTE:");

        corEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        corEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        corEscorpiao.setText("COR:");

        numerosEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        numerosEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        numerosEscorpiao.setText("NÚMERO DA SORTE:");

        tfPeriodoEscorpiao.setText(" 23/10 – 21/11");

        tfElementoEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setText("Plutão");
        tfPlanetaEscorpiao.addActionListener(this::tfPlanetaEscorpiaoActionPerformed);

        tfCorEscorpiao.setText("| Vermelho-escuro");

        tfNumerosEscorpiao.setText(" 8    ");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(periodoEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoEscorpiao))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                        .addComponent(planetaEscorpiao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaEscorpiao))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                        .addComponent(elementoEscorpiao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoEscorpiao)
                            .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoEscorpiao)
                        .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosEscorpiao)
                    .addComponent(tfNumerosEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        escorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        pfortesEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        pfortesEscorpiao.setText("Pontos Fortes:");

        tituloCaracteristicaEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaEscorpiao.setText("Características");

        pMelhorarEscorpiao.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarEscorpiao.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarEscorpiao.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("determinação, intensidade, lealdade, coragem e capacidade de investigação.");
        jScrollPane51.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText(" ciúme, desconfiança, possessividade, rancor e tendência ao controle.\n");
        jScrollPane52.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane51, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane52)
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesEscorpiao)
                            .addComponent(pMelhorarEscorpiao)
                            .addComponent(tituloCaracteristicaEscorpiao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        escorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoEscorpiao.setText("Previsão do Dia");

        txPrevisaoEscorpiao.setColumns(20);
        txPrevisaoEscorpiao.setRows(5);
        jScrollPane21.setViewportView(txPrevisaoEscorpiao);

        btnAtualizarEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisoeEscorpiao);
        areaPrevisoeEscorpiao.setLayout(areaPrevisoeEscorpiaoLayout);
        areaPrevisoeEscorpiaoLayout.setHorizontalGroup(
            areaPrevisoeEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoeEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeEscorpiaoLayout.createSequentialGroup()
                        .addComponent(previsaoEscorpiao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane21))
                .addContainerGap())
            .addGroup(areaPrevisoeEscorpiaoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeEscorpiaoLayout.setVerticalGroup(
            areaPrevisoeEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeEscorpiaoLayout.createSequentialGroup()
                .addComponent(previsaoEscorpiao)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        escorpiao.add(areaPrevisoeEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        tfAmorEscorpiao.setText("95%");

        tfTrabalhoEscorpiao.setText("88%");

        tfSaudeEscorpiao.setText("75%");

        tfSorteEscorpiao.setText("80%");

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorEscorpiao)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addComponent(amorEscorpiao)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSorteEscorpiao)
                    .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloEnergiaEscorpiao))
                            .addComponent(trabalhoEscorpiao))
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sorteEscorpiao))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfTrabalhoEscorpiao))))
                .addContainerGap())
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaEscorpiao)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao)
                .addGap(4, 4, 4)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saudeEscorpiao)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        escorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 310));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem do Dia");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        jScrollPane22.setViewportView(txMensagemEscorpiao);

        btnCopiarMensagemEscorpiao.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane22)))
                .addContainerGap())
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        escorpiao.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        escorpiao.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, -1, -1));

        areaAbas.addTab("Escorpião", escorpiao);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesPeixes.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoPeixes.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoPeixes.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoPeixes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/peixes.png"))); // NOI18N

        tituloPeixes.setBackground(new java.awt.Color(0, 204, 204));
        tituloPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloPeixes.setForeground(new java.awt.Color(51, 51, 51));
        tituloPeixes.setText("Peixes");

        periodoPeixes.setBackground(new java.awt.Color(0, 204, 204));
        periodoPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoPeixes.setForeground(new java.awt.Color(51, 51, 51));
        periodoPeixes.setText("PERIODO:");

        elementoPeixes.setBackground(new java.awt.Color(0, 204, 204));
        elementoPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoPeixes.setForeground(new java.awt.Color(51, 51, 51));
        elementoPeixes.setText("ELEMENTO:");

        planetaPeixes.setBackground(new java.awt.Color(0, 204, 204));
        planetaPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaPeixes.setForeground(new java.awt.Color(51, 51, 51));
        planetaPeixes.setText("PLANETA REGENTE:");

        corPeixes.setBackground(new java.awt.Color(0, 204, 204));
        corPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corPeixes.setForeground(new java.awt.Color(51, 51, 51));
        corPeixes.setText("COR:");

        numerosPeixes.setBackground(new java.awt.Color(0, 204, 204));
        numerosPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosPeixes.setForeground(new java.awt.Color(51, 51, 51));
        numerosPeixes.setText("NÚMERO DA SORTE:");

        tfPeriodoPeixes.setText("19/02 – 20/03 ");

        tfElementoPeixes.setText(" Água");

        tfPlanetaPeixes.setText("Netuno");
        tfPlanetaPeixes.addActionListener(this::tfPlanetaPeixesActionPerformed);

        tfCorPeixes.setText("Lilás/Verde-mar");

        tfNumerosPeixes.setText("7");

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corPeixes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosPeixes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addComponent(periodoPeixes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoPeixes))
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                                        .addComponent(planetaPeixes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaPeixes))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesPeixesLayout.createSequentialGroup()
                                        .addComponent(elementoPeixes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addComponent(tituloPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoPeixes)
                            .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoPeixes)
                        .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosPeixes)
                    .addComponent(tfNumerosPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesPeixes.setBackground(new java.awt.Color(0, 204, 204));
        pfortesPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesPeixes.setForeground(new java.awt.Color(51, 51, 51));
        pfortesPeixes.setText("Pontos Fortes:");

        tituloCaracteristicaPeixes.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaPeixes.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaPeixes.setText("Características");

        pMelhorarPeixes.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarPeixes.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarPeixes.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText("empatia, imaginação, sensibilidade, criatividade e compaixão.");
        jScrollPane37.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText("idealização, escapismo, indecisão, excesso de sensibilidade e dificuldade em estabelecer limites.");
        jScrollPane38.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane38)
                    .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesPeixes)
                            .addComponent(pMelhorarPeixes)
                            .addComponent(tituloCaracteristicaPeixes))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        tituloEnergiaTouro2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaTouro2.setText("Energia do Dia");

        amorTouro2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorTouro2.setText("Amor:");

        trabalhoTouro2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoTouro2.setText("Trabalho:");

        saudeTouro2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeTouro2.setText("Saúde:");

        sorteTouro2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteTouro2.setText("Sorte:");

        tfSaudeTouro2.setText("60%");

        tfSorteTouro2.setText("85%");

        tituloEnergiaPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaPeixes.setText("Energia do Dia");

        amorPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorPeixes.setText("Amor:");

        trabalhoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoPeixes.setText("Trabalho:");

        saudePeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudePeixes.setText("Saúde:");

        sortePeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sortePeixes.setText("Sorte:");

        tfAmorPeixe.setText("93%");

        tfTrabalhoPeixe.setText("68%");

        areaInformacoes4.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoTouro3.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoTouro3.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoTouro3.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro3.setBackground(new java.awt.Color(0, 204, 204));
        tituloTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloTouro3.setForeground(new java.awt.Color(51, 51, 51));
        tituloTouro3.setText("Touro");

        periodoTouro3.setBackground(new java.awt.Color(0, 204, 204));
        periodoTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoTouro3.setForeground(new java.awt.Color(51, 51, 51));
        periodoTouro3.setText("PERIODO:");

        elementoTouro3.setBackground(new java.awt.Color(0, 204, 204));
        elementoTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoTouro3.setForeground(new java.awt.Color(51, 51, 51));
        elementoTouro3.setText("ELEMENTO:");

        planetaTouro3.setBackground(new java.awt.Color(0, 204, 204));
        planetaTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaTouro3.setForeground(new java.awt.Color(51, 51, 51));
        planetaTouro3.setText("PLANETA REGENTE:");

        corTouro3.setBackground(new java.awt.Color(0, 204, 204));
        corTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corTouro3.setForeground(new java.awt.Color(51, 51, 51));
        corTouro3.setText("COR:");

        numerosTouro3.setBackground(new java.awt.Color(0, 204, 204));
        numerosTouro3.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosTouro3.setForeground(new java.awt.Color(51, 51, 51));
        numerosTouro3.setText("NÚMERO DA SORTE:");

        tfPlanetaTouro3.addActionListener(this::tfPlanetaTouro3ActionPerformed);

        javax.swing.GroupLayout areaInformacoes4Layout = new javax.swing.GroupLayout(areaInformacoes4);
        areaInformacoes4.setLayout(areaInformacoes4Layout);
        areaInformacoes4Layout.setHorizontalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes4Layout.createSequentialGroup()
                        .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corTouro3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosTouro3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                                .addComponent(periodoTouro3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro3))
                            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                                        .addComponent(planetaTouro3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaTouro3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes4Layout.createSequentialGroup()
                                        .addComponent(elementoTouro3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoes4Layout.setVerticalGroup(
            areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes4Layout.createSequentialGroup()
                        .addComponent(tituloTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoTouro3)
                            .addComponent(tfPeriodoTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoTouro3)
                        .addComponent(tfElementoTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro3)
                    .addComponent(tfPlanetaTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro3)
                    .addComponent(tfCorTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoes4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosTouro3)
                    .addComponent(tfNumerosTouro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfortesTouro5.setBackground(new java.awt.Color(0, 204, 204));
        pfortesTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesTouro5.setForeground(new java.awt.Color(51, 51, 51));
        pfortesTouro5.setText("Pontos Fortes:");

        tituloCaracteristicaTouro5.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaTouro5.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaTouro5.setText("Características");

        pMelhorarTouro5.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarTouro5.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarTouro5.setText("Pontos a Melhorar:");

        txFortesTouro5.setColumns(20);
        txFortesTouro5.setRows(5);
        jScrollPane53.setViewportView(txFortesTouro5);

        txMelhorarTouro5.setColumns(20);
        txMelhorarTouro5.setRows(5);
        jScrollPane54.setViewportView(txMelhorarTouro5);

        javax.swing.GroupLayout areaCaracteristicas5Layout = new javax.swing.GroupLayout(areaCaracteristicas5);
        areaCaracteristicas5.setLayout(areaCaracteristicas5Layout);
        areaCaracteristicas5Layout.setHorizontalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                        .addGroup(areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesTouro5)
                            .addComponent(pMelhorarTouro5)
                            .addComponent(tituloCaracteristicaTouro5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicas5Layout.setVerticalGroup(
            areaCaracteristicas5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesTouro5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorPeixe)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoPeixes)
                    .addComponent(amorPeixes))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoPeixe)
                    .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaPeixes)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSortePeixes)
                    .addComponent(tfSaudePeixes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortePeixes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaPeixes)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes)
                .addGap(4, 4, 4)
                .addComponent(tfAmorPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudePeixes)
                .addGap(3, 3, 3)
                .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout areaEnergiaPeixeLayout = new javax.swing.GroupLayout(areaEnergiaPeixe);
        areaEnergiaPeixe.setLayout(areaEnergiaPeixeLayout);
        areaEnergiaPeixeLayout.setHorizontalGroup(
            areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorPeixes)
            .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoTouro2)
                    .addComponent(amorTouro2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoPeixes)
                    .addComponent(tfSaudeTouro2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfSorteTouro2)
                    .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEnergiaTouro2)
                            .addComponent(saudeTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sorteTouro2))
                        .addGap(0, 304, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        areaEnergiaPeixeLayout.setVerticalGroup(
            areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro2)
                .addGap(18, 18, 18)
                .addComponent(amorTouro2)
                .addGap(4, 4, 4)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoTouro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro2)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        peixes.add(areaEnergiaPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 440, 310));

        tituloMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemPeixes.setText("Mensagem do Dia");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        jScrollPane23.setViewportView(txMensagemPeixes);

        btnCopiarMensagemPeixes.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemPeixes.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane23)))
                .addContainerGap())
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        previsaoPeixes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoPeixes.setText("Previsão do Dia");

        txPrevisaoPeixes.setColumns(20);
        txPrevisaoPeixes.setRows(5);
        jScrollPane24.setViewportView(txPrevisaoPeixes);

        btnAtualizarPeixes.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarPeixes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarPeixes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPeixes.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoePeixesLayout = new javax.swing.GroupLayout(areaPrevisoePeixes);
        areaPrevisoePeixes.setLayout(areaPrevisoePeixesLayout);
        areaPrevisoePeixesLayout.setHorizontalGroup(
            areaPrevisoePeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoePeixesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoePeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoePeixesLayout.createSequentialGroup()
                        .addComponent(previsaoPeixes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane24))
                .addContainerGap())
            .addGroup(areaPrevisoePeixesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoePeixesLayout.setVerticalGroup(
            areaPrevisoePeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoePeixesLayout.createSequentialGroup()
                .addComponent(previsaoPeixes)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        peixes.add(areaPrevisoePeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesSagitario.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoSagitario.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoSagitario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sagitario.png"))); // NOI18N

        tituloSagitario.setBackground(new java.awt.Color(0, 204, 204));
        tituloSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tituloSagitario.setText("Sagitário");

        periodoSagitario.setBackground(new java.awt.Color(0, 204, 204));
        periodoSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        periodoSagitario.setText("PERIODO:");

        elementoSagitario.setBackground(new java.awt.Color(0, 204, 204));
        elementoSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoSagitario.setForeground(new java.awt.Color(51, 51, 51));
        elementoSagitario.setText("ELEMENTO:");

        planetaSagitario.setBackground(new java.awt.Color(0, 204, 204));
        planetaSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaSagitario.setForeground(new java.awt.Color(51, 51, 51));
        planetaSagitario.setText("PLANETA REGENTE:");

        corSagitario.setBackground(new java.awt.Color(0, 204, 204));
        corSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corSagitario.setForeground(new java.awt.Color(51, 51, 51));
        corSagitario.setText("COR:");

        numerosSagitario.setBackground(new java.awt.Color(0, 204, 204));
        numerosSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosSagitario.setForeground(new java.awt.Color(51, 51, 51));
        numerosSagitario.setText("NÚMERO DA SORTE:");

        tfPeriodoSagitario.setText(" 22/11 – 21/12");

        tfElementoSagitario.setText("Fogo ");

        tfPlanetaSagitario.setText("Júpiter");
        tfPlanetaSagitario.addActionListener(this::tfPlanetaSagitarioActionPerformed);

        tfCorSagitario.setText("Roxo  ");

        tfNumerosSagitario.setText("3   ");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corSagitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosSagitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addComponent(periodoSagitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoSagitario))
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                                        .addComponent(planetaSagitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaSagitario))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesSagitarioLayout.createSequentialGroup()
                                        .addComponent(elementoSagitario)
                                        .addGap(20, 20, 20)
                                        .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoSagitario)
                            .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoSagitario)
                        .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosSagitario)
                    .addComponent(tfNumerosSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesSagitario.setBackground(new java.awt.Color(0, 204, 204));
        pfortesSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesSagitario.setForeground(new java.awt.Color(51, 51, 51));
        pfortesSagitario.setText("Pontos Fortes:");

        tituloCaracteristicaSagitario.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaSagitario.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaSagitario.setText("Características");

        pMelhorarSagitario.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarSagitario.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarSagitario.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText(" otimismo, liberdade, aventura, sinceridade e entusiasmo.");
        jScrollPane39.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText("impulsividade, excesso de sinceridade, impaciência, irresponsabilidade e dificuldade com limites.");
        jScrollPane40.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane40)
                    .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                        .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesSagitario)
                            .addComponent(pMelhorarSagitario)
                            .addComponent(tituloCaracteristicaSagitario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 380, -1));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaSagitario.setText("Energia do Dia");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorSagitario.setText("Amor:");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeSagitario.setText("Saúde:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteSagitario.setText("Sorte:");

        tfAmorSagitario.setText("78%");

        tfTrabalhoSagitario.setText("98%");

        tfSaudeSagitario.setText("68%");

        tfSorteSagitario.setText("75%");

        areaInformacoes5.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoTouro4.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoTouro4.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoTouro4.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro4.setBackground(new java.awt.Color(0, 204, 204));
        tituloTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloTouro4.setForeground(new java.awt.Color(51, 51, 51));
        tituloTouro4.setText("Touro");

        periodoTouro4.setBackground(new java.awt.Color(0, 204, 204));
        periodoTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoTouro4.setForeground(new java.awt.Color(51, 51, 51));
        periodoTouro4.setText("PERIODO:");

        elementoTouro4.setBackground(new java.awt.Color(0, 204, 204));
        elementoTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoTouro4.setForeground(new java.awt.Color(51, 51, 51));
        elementoTouro4.setText("ELEMENTO:");

        planetaTouro4.setBackground(new java.awt.Color(0, 204, 204));
        planetaTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaTouro4.setForeground(new java.awt.Color(51, 51, 51));
        planetaTouro4.setText("PLANETA REGENTE:");

        corTouro4.setBackground(new java.awt.Color(0, 204, 204));
        corTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corTouro4.setForeground(new java.awt.Color(51, 51, 51));
        corTouro4.setText("COR:");

        numerosTouro4.setBackground(new java.awt.Color(0, 204, 204));
        numerosTouro4.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosTouro4.setForeground(new java.awt.Color(51, 51, 51));
        numerosTouro4.setText("NÚMERO DA SORTE:");

        tfPlanetaTouro4.addActionListener(this::tfPlanetaTouro4ActionPerformed);

        javax.swing.GroupLayout areaInformacoes5Layout = new javax.swing.GroupLayout(areaInformacoes5);
        areaInformacoes5.setLayout(areaInformacoes5Layout);
        areaInformacoes5Layout.setHorizontalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes5Layout.createSequentialGroup()
                        .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corTouro4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosTouro4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                .addComponent(periodoTouro4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro4))
                            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                                        .addComponent(planetaTouro4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaTouro4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes5Layout.createSequentialGroup()
                                        .addComponent(elementoTouro4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoes5Layout.setVerticalGroup(
            areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes5Layout.createSequentialGroup()
                        .addComponent(tituloTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoTouro4)
                            .addComponent(tfPeriodoTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoTouro4)
                        .addComponent(tfElementoTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro4)
                    .addComponent(tfPlanetaTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro4)
                    .addComponent(tfCorTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoes5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosTouro4)
                    .addComponent(tfNumerosTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfortesTouro6.setBackground(new java.awt.Color(0, 204, 204));
        pfortesTouro6.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesTouro6.setForeground(new java.awt.Color(51, 51, 51));
        pfortesTouro6.setText("Pontos Fortes:");

        tituloCaracteristicaTouro6.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaTouro6.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaTouro6.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaTouro6.setText("Características");

        pMelhorarTouro6.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarTouro6.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarTouro6.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarTouro6.setText("Pontos a Melhorar:");

        txFortesTouro6.setColumns(20);
        txFortesTouro6.setRows(5);
        jScrollPane55.setViewportView(txFortesTouro6);

        txMelhorarTouro6.setColumns(20);
        txMelhorarTouro6.setRows(5);
        jScrollPane56.setViewportView(txMelhorarTouro6);

        javax.swing.GroupLayout areaCaracteristicas6Layout = new javax.swing.GroupLayout(areaCaracteristicas6);
        areaCaracteristicas6.setLayout(areaCaracteristicas6Layout);
        areaCaracteristicas6Layout.setHorizontalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                        .addGroup(areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesTouro6)
                            .addComponent(pMelhorarTouro6)
                            .addComponent(tituloCaracteristicaTouro6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicas6Layout.setVerticalGroup(
            areaCaracteristicas6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesTouro6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorSagitario)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoSagitario)
                    .addComponent(amorSagitario))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoSagitario)
                    .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaSagitario)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSorteSagitario)
                    .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteSagitario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaSagitario)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario)
                .addGap(4, 4, 4)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeSagitario)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem do Dia");

        txMensagemSagitario.setColumns(20);
        txMensagemSagitario.setRows(5);
        jScrollPane25.setViewportView(txMensagemSagitario);

        btnCopiarMensagemSagitario.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCopiarMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane25)))
                .addContainerGap())
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 370, 230));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoSagitario.setText("Previsão do Dia");

        txPrevisaoSagitario.setColumns(20);
        txPrevisaoSagitario.setRows(5);
        jScrollPane26.setViewportView(txPrevisaoSagitario);

        btnAtualizarSagitario.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarSagitario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesSagitarioLayout = new javax.swing.GroupLayout(areaPrevisoesSagitario);
        areaPrevisoesSagitario.setLayout(areaPrevisoesSagitarioLayout);
        areaPrevisoesSagitarioLayout.setHorizontalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                        .addComponent(previsaoSagitario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane26))
                .addContainerGap())
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnAtualizarSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoesSagitarioLayout.setVerticalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addComponent(previsaoSagitario)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        sagitario.add(areaPrevisoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 370, 230));

        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCarpricornio1.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoCarpricornio.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoCarpricornio.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoCarpricornio.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoCarpricornio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/capricornio.png"))); // NOI18N

        tituloCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        tituloCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        tituloCarpricornio1.setText("Carpricórnio");

        periodoCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        periodoCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        periodoCarpricornio1.setText("PERIODO:");

        elementoCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        elementoCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        elementoCarpricornio1.setText("ELEMENTO:");

        planetaCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        planetaCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        planetaCarpricornio1.setText("PLANETA REGENTE:");

        corCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        corCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        corCarpricornio1.setText("COR:");

        numerosCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        numerosCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        numerosCarpricornio1.setText("NÚMERO DA SORTE:");

        tfPeriodoCarpricornio1.setText(" 22/12 – 19/01");

        tfElementoCarpricornio1.setText("Terra");

        tfPlanetaCarpricornio1.setText("Saturno   ");
        tfPlanetaCarpricornio1.addActionListener(this::tfPlanetaCarpricornio1ActionPerformed);

        tfCorCarpricornio1.setText(" Marrom/Preto");

        tfNumerosCarpricornio1.setText("8   ");

        javax.swing.GroupLayout areaInformacoesCarpricornio1Layout = new javax.swing.GroupLayout(areaInformacoesCarpricornio1);
        areaInformacoesCarpricornio1.setLayout(areaInformacoesCarpricornio1Layout);
        areaInformacoesCarpricornio1Layout.setHorizontalGroup(
            areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                        .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corCarpricornio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosCarpricornio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                .addComponent(periodoCarpricornio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoCarpricornio1))
                            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                        .addComponent(planetaCarpricornio1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaCarpricornio1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCarpricornio1Layout.createSequentialGroup()
                                        .addComponent(elementoCarpricornio1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoCarpricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCarpricornio1Layout.setVerticalGroup(
            areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoCarpricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesCarpricornio1Layout.createSequentialGroup()
                        .addComponent(tituloCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoCarpricornio1)
                            .addComponent(tfPeriodoCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoCarpricornio1)
                        .addComponent(tfElementoCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCarpricornio1)
                    .addComponent(tfPlanetaCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCarpricornio1)
                    .addComponent(tfCorCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoesCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosCarpricornio1)
                    .addComponent(tfNumerosCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        capricornio.add(areaInformacoesCarpricornio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 560));

        pfortesCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        pfortesCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        pfortesCarpricornio1.setText("Pontos Fortes:");

        tituloCaracteristicaCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaCarpricornio1.setText("Características");

        pMelhorarCarpricornio1.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarCarpricornio1.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarCarpricornio1.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarCarpricornio1.setText("Pontos a Melhorar:");

        txFortesCarpricornio.setColumns(20);
        txFortesCarpricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txFortesCarpricornio.setRows(5);
        txFortesCarpricornio.setText("disciplina, responsabilidade, ambição, persistência e organização.");
        jScrollPane57.setViewportView(txFortesCarpricornio);

        txMelhorarCarpricornio.setColumns(20);
        txMelhorarCarpricornio.setRows(5);
        txMelhorarCarpricornio.setText(" pessimismo, rigidez, excesso de trabalho, frieza aparente e dificuldade em demonstrar emoções.");
        jScrollPane58.setViewportView(txMelhorarCarpricornio);

        javax.swing.GroupLayout areaCaracteristicasCarpricornio1Layout = new javax.swing.GroupLayout(areaCaracteristicasCarpricornio1);
        areaCaracteristicasCarpricornio1.setLayout(areaCaracteristicasCarpricornio1Layout);
        areaCaracteristicasCarpricornio1Layout.setHorizontalGroup(
            areaCaracteristicasCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicasCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane57, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jScrollPane58)
                    .addGroup(areaCaracteristicasCarpricornio1Layout.createSequentialGroup()
                        .addGroup(areaCaracteristicasCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesCarpricornio1)
                            .addComponent(pMelhorarCarpricornio1)
                            .addComponent(tituloCaracteristicaCarpricornio1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicasCarpricornio1Layout.setVerticalGroup(
            areaCaracteristicasCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesCarpricornio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCarpricornio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        capricornio.add(areaCaracteristicasCarpricornio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 380, -1));

        tituloEnergiaTouro4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaTouro4.setText("Energia do Dia");

        amorTouro4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorTouro4.setText("Amor:");

        trabalhoTouro4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoTouro4.setText("Trabalho:");

        saudeTouro4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeTouro4.setText("Saúde:");

        sorteTouro4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteTouro4.setText("Sorte:");

        tfAmorCarpricornio.setText("70%");

        tfTrabalhoCarpricornio1.setText("98%");

        tfSaudeCarpricornio1.setText("68%");

        tfSorteCarpricornio1.setText("75%");

        tituloEnergiaCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaCarpricornio1.setText("Energia do Dia");

        amorCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amorCarpricornio1.setText("Amor:");

        trabalhoCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trabalhoCarpricornio1.setText("Trabalho:");

        saudeCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saudeCarpricornio1.setText("Saúde:");

        sorteCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sorteCarpricornio1.setText("Sorte:");

        areaInformacoes6.setBackground(new java.awt.Color(204, 204, 204));

        imgSignoTouro5.setBackground(new java.awt.Color(0, 204, 204));
        imgSignoTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 14)); // NOI18N
        imgSignoTouro5.setForeground(new java.awt.Color(51, 51, 51));
        imgSignoTouro5.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.png")); // NOI18N

        tituloTouro5.setBackground(new java.awt.Color(0, 204, 204));
        tituloTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloTouro5.setForeground(new java.awt.Color(51, 51, 51));
        tituloTouro5.setText("Touro");

        periodoTouro5.setBackground(new java.awt.Color(0, 204, 204));
        periodoTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        periodoTouro5.setForeground(new java.awt.Color(51, 51, 51));
        periodoTouro5.setText("PERIODO:");

        elementoTouro5.setBackground(new java.awt.Color(0, 204, 204));
        elementoTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        elementoTouro5.setForeground(new java.awt.Color(51, 51, 51));
        elementoTouro5.setText("ELEMENTO:");

        planetaTouro5.setBackground(new java.awt.Color(0, 204, 204));
        planetaTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        planetaTouro5.setForeground(new java.awt.Color(51, 51, 51));
        planetaTouro5.setText("PLANETA REGENTE:");

        corTouro5.setBackground(new java.awt.Color(0, 204, 204));
        corTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        corTouro5.setForeground(new java.awt.Color(51, 51, 51));
        corTouro5.setText("COR:");

        numerosTouro5.setBackground(new java.awt.Color(0, 204, 204));
        numerosTouro5.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        numerosTouro5.setForeground(new java.awt.Color(51, 51, 51));
        numerosTouro5.setText("NÚMERO DA SORTE:");

        tfPlanetaTouro5.addActionListener(this::tfPlanetaTouro5ActionPerformed);

        javax.swing.GroupLayout areaInformacoes6Layout = new javax.swing.GroupLayout(areaInformacoes6);
        areaInformacoes6.setLayout(areaInformacoes6Layout);
        areaInformacoes6Layout.setHorizontalGroup(
            areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tituloTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(corTouro5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numerosTouro5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumerosTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addComponent(periodoTouro5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro5))
                            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(planetaTouro5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfPlanetaTouro5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoes6Layout.createSequentialGroup()
                                        .addComponent(elementoTouro5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfElementoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(imgSignoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoes6Layout.setVerticalGroup(
            areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoes6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imgSignoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoes6Layout.createSequentialGroup()
                        .addComponent(tituloTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoTouro5)
                            .addComponent(tfPeriodoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(elementoTouro5)
                        .addComponent(tfElementoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro5)
                    .addComponent(tfPlanetaTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro5)
                    .addComponent(tfCorTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(areaInformacoes6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerosTouro5)
                    .addComponent(tfNumerosTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pfortesTouro7.setBackground(new java.awt.Color(0, 204, 204));
        pfortesTouro7.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pfortesTouro7.setForeground(new java.awt.Color(51, 51, 51));
        pfortesTouro7.setText("Pontos Fortes:");

        tituloCaracteristicaTouro7.setBackground(new java.awt.Color(0, 204, 204));
        tituloCaracteristicaTouro7.setFont(new java.awt.Font("Sans Serif Collection", 1, 18)); // NOI18N
        tituloCaracteristicaTouro7.setForeground(new java.awt.Color(51, 51, 51));
        tituloCaracteristicaTouro7.setText("Características");

        pMelhorarTouro7.setBackground(new java.awt.Color(0, 204, 204));
        pMelhorarTouro7.setFont(new java.awt.Font("Sans Serif Collection", 1, 12)); // NOI18N
        pMelhorarTouro7.setForeground(new java.awt.Color(51, 51, 51));
        pMelhorarTouro7.setText("Pontos a Melhorar:");

        txFortesTouro7.setColumns(20);
        txFortesTouro7.setRows(5);
        jScrollPane59.setViewportView(txFortesTouro7);

        txMelhorarTouro7.setColumns(20);
        txMelhorarTouro7.setRows(5);
        jScrollPane60.setViewportView(txMelhorarTouro7);

        javax.swing.GroupLayout areaCaracteristicas7Layout = new javax.swing.GroupLayout(areaCaracteristicas7);
        areaCaracteristicas7.setLayout(areaCaracteristicas7Layout);
        areaCaracteristicas7Layout.setHorizontalGroup(
            areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaCaracteristicas7Layout.createSequentialGroup()
                        .addGroup(areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfortesTouro7)
                            .addComponent(pMelhorarTouro7)
                            .addComponent(tituloCaracteristicaTouro7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaCaracteristicas7Layout.setVerticalGroup(
            areaCaracteristicas7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicas7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicaTouro7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfortesTouro7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout areaEnergiaCarpricornio1Layout = new javax.swing.GroupLayout(areaEnergiaCarpricornio1);
        areaEnergiaCarpricornio1.setLayout(areaEnergiaCarpricornio1Layout);
        areaEnergiaCarpricornio1Layout.setHorizontalGroup(
            areaEnergiaCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfAmorTouro5)
            .addGroup(areaEnergiaCarpricornio1Layout.createSequentialGroup()
                .addGroup(areaEnergiaCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoCarpricornio1)
                    .addComponent(amorCarpricornio1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergiaCarpricornio1Layout.createSequentialGroup()
                .addGroup(areaEnergiaCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoTouro5)
                    .addGroup(areaEnergiaCarpricornio1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaCarpricornio1)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSortePeixes2)
                    .addComponent(tfSaudePeixes2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteCarpricornio1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaCarpricornio1Layout.setVerticalGroup(
            areaEnergiaCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCarpricornio1)
                .addGap(18, 18, 18)
                .addComponent(amorCarpricornio1)
                .addGap(4, 4, 4)
                .addComponent(tfAmorTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoCarpricornio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoTouro5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCarpricornio1)
                .addGap(3, 3, 3)
                .addComponent(tfSaudePeixes2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCarpricornio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tfAmorCarpricornio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(trabalhoTouro4))
                .addComponent(amorTouro4))
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoCarpricornio1)
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloEnergiaTouro4)
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(tfSorteCarpricornio1)
                    .addComponent(tfSaudeCarpricornio1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saudeTouro4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteTouro4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro4)
                .addGap(18, 18, 18)
                .addComponent(amorTouro4)
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(trabalhoTouro4))
                    .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAmorCarpricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro4)
                .addGap(3, 3, 3)
                .addComponent(tfSaudeCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(areaEnergiaCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 440, 310));

        tituloMensagemCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemCarpricornio1.setText("Mensagem do Dia");

        txMensagemCarpricornio.setColumns(20);
        txMensagemCarpricornio.setRows(5);
        jScrollPane27.setViewportView(txMensagemCarpricornio);

        btnCopiarMensagemCarpricornio1.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopiarMensagemCarpricornio1.setForeground(new java.awt.Color(255, 255, 255));
        btnCopiarMensagemCarpricornio1.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCarpricornio1Layout = new javax.swing.GroupLayout(areaMensagemCarpricornio1);
        areaMensagemCarpricornio1.setLayout(areaMensagemCarpricornio1Layout);
        areaMensagemCarpricornio1Layout.setHorizontalGroup(
            areaMensagemCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCarpricornio1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnCopiarMensagemCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(areaMensagemCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaMensagemCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCarpricornio1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(areaMensagemCarpricornio1Layout.createSequentialGroup()
                        .addComponent(tituloMensagemCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaMensagemCarpricornio1Layout.setVerticalGroup(
            areaMensagemCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCarpricornio1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCarpricornio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 370, 230));

        previsaoCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCarpricornio1.setText("Previsão do Dia");

        txPrevisaoCarpricornio.setColumns(20);
        txPrevisaoCarpricornio.setRows(5);
        jScrollPane28.setViewportView(txPrevisaoCarpricornio);

        btnAtualizarCarpricornio1.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarCarpricornio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizarCarpricornio1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCarpricornio1.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoeCarpricornio1Layout = new javax.swing.GroupLayout(areaPrevisoeCarpricornio1);
        areaPrevisoeCarpricornio1.setLayout(areaPrevisoeCarpricornio1Layout);
        areaPrevisoeCarpricornio1Layout.setHorizontalGroup(
            areaPrevisoeCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28)
            .addGroup(areaPrevisoeCarpricornio1Layout.createSequentialGroup()
                .addGroup(areaPrevisoeCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoeCarpricornio1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(previsaoCarpricornio1))
                    .addGroup(areaPrevisoeCarpricornio1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAtualizarCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        areaPrevisoeCarpricornio1Layout.setVerticalGroup(
            areaPrevisoeCarpricornio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoeCarpricornio1Layout.createSequentialGroup()
                .addComponent(previsaoCarpricornio1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarCarpricornio1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        capricornio.add(areaPrevisoeCarpricornio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 370, 230));

        fundoCapriconio.setIcon(new javax.swing.ImageIcon("C:\\Users\\AntônioVieira\\Documents\\projetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Portal-Edicase-Astrologia_horoscopododia-signos.jpg")); // NOI18N
        fundoCapriconio.setText(" 22/12 – 19/01");
        capricornio.add(fundoCapriconio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        areaAbas.addTab("Carpricónio", capricornio);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPlanetaAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaAriesActionPerformed

    private void tfPlanetaTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouroActionPerformed

    private void tfPlanetaTouro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouro2ActionPerformed

    private void tfPlanetaCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaCancerActionPerformed

    private void tfPlanetaGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaGemeosActionPerformed

    private void tfPlanetaLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaLeaoActionPerformed

    private void tfPlanetaVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaVirgemActionPerformed

    private void tfPlanetaLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaLibraActionPerformed

    private void tfPlanetaAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaAquarioActionPerformed

    private void tfPlanetaEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaEscorpiaoActionPerformed

    private void tfPlanetaPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaPeixesActionPerformed

    private void tfPlanetaTouro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouro3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouro3ActionPerformed

    private void tfPlanetaSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaSagitarioActionPerformed

    private void tfPlanetaTouro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouro4ActionPerformed

    private void tfPlanetaCarpricornio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaCarpricornio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaCarpricornio1ActionPerformed

    private void tfPlanetaTouro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaTouro5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaTouro5ActionPerformed

    private void btnAtualizarLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarLeaoActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
        CalcularSigno();
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalcularCompatibilidade();
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
          java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }
        //</editor-fold>

        /* Create and display the form */
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCarpricornio1;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos1;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorTouro1;
    private javax.swing.JLabel amorTouro2;
    private javax.swing.JLabel amorTouro4;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCaracteristicas;
    private javax.swing.JPanel areaCaracteristicas3;
    private javax.swing.JPanel areaCaracteristicas5;
    private javax.swing.JPanel areaCaracteristicas6;
    private javax.swing.JPanel areaCaracteristicas7;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasCarpricornio1;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaCaracteristicasv;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaCarpricornio1;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixe;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaTouro1;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoes;
    private javax.swing.JPanel areaInformacoes3;
    private javax.swing.JPanel areaInformacoes4;
    private javax.swing.JPanel areaInformacoes5;
    private javax.swing.JPanel areaInformacoes6;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCarpricornio1;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagem1;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCarpricornio1;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisoe;
    private javax.swing.JPanel areaPrevisoeAquario;
    private javax.swing.JPanel areaPrevisoeCancer;
    private javax.swing.JPanel areaPrevisoeCarpricornio1;
    private javax.swing.JPanel areaPrevisoeEscorpiao;
    private javax.swing.JPanel areaPrevisoeGemeos;
    private javax.swing.JPanel areaPrevisoeLeao;
    private javax.swing.JPanel areaPrevisoeLibra;
    private javax.swing.JPanel areaPrevisoePeixes;
    private javax.swing.JPanel areaPrevisoeTouro;
    private javax.swing.JPanel areaPrevisoeVirgem;
    private javax.swing.JPanel areaPrevisoesSagitario;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarAquario;
    private javax.swing.JButton btnAtualizarAries;
    private javax.swing.JButton btnAtualizarCancer;
    private javax.swing.JButton btnAtualizarCarpricornio1;
    private javax.swing.JButton btnAtualizarEscorpiao;
    private javax.swing.JButton btnAtualizarGemeos1;
    private javax.swing.JButton btnAtualizarLeao;
    private javax.swing.JButton btnAtualizarLibra;
    private javax.swing.JButton btnAtualizarPeixes;
    private javax.swing.JButton btnAtualizarSagitario;
    private javax.swing.JButton btnAtualizarTouro;
    private javax.swing.JButton btnAtualizarVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMensagem1;
    private javax.swing.JButton btnCopiarMensagemAquario;
    private javax.swing.JButton btnCopiarMensagemCancer;
    private javax.swing.JButton btnCopiarMensagemCarpricornio1;
    private javax.swing.JButton btnCopiarMensagemEscorpiao;
    private javax.swing.JButton btnCopiarMensagemGemeos1;
    private javax.swing.JButton btnCopiarMensagemLeao;
    private javax.swing.JButton btnCopiarMensagemLibra;
    private javax.swing.JButton btnCopiarMensagemPeixes;
    private javax.swing.JButton btnCopiarMensagemSagitario;
    private javax.swing.JButton btnCopiarMensagemTouro;
    private javax.swing.JButton btnCopiarMensagemVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCarpricornio1;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corTouro2;
    private javax.swing.JLabel corTouro3;
    private javax.swing.JLabel corTouro4;
    private javax.swing.JLabel corTouro5;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel descobraSeuSigno;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCarpricornio1;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoTouro2;
    private javax.swing.JLabel elementoTouro3;
    private javax.swing.JLabel elementoTouro4;
    private javax.swing.JLabel elementoTouro5;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpiao;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapriconio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSigno;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCarpricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoTouro2;
    private javax.swing.JLabel imgSignoTouro3;
    private javax.swing.JLabel imgSignoTouro4;
    private javax.swing.JLabel imgSignoTouro5;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numerosAquario;
    private javax.swing.JLabel numerosAries;
    private javax.swing.JLabel numerosCancer;
    private javax.swing.JLabel numerosCarpricornio1;
    private javax.swing.JLabel numerosEscorpiao;
    private javax.swing.JLabel numerosGemeos;
    private javax.swing.JLabel numerosLeao;
    private javax.swing.JLabel numerosLibra;
    private javax.swing.JLabel numerosPeixes;
    private javax.swing.JLabel numerosSagitario;
    private javax.swing.JLabel numerosTouro;
    private javax.swing.JLabel numerosTouro2;
    private javax.swing.JLabel numerosTouro3;
    private javax.swing.JLabel numerosTouro4;
    private javax.swing.JLabel numerosTouro5;
    private javax.swing.JLabel numerosVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCarpricornio1;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos1;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarTouro2;
    private javax.swing.JLabel pMelhorarTouro5;
    private javax.swing.JLabel pMelhorarTouro6;
    private javax.swing.JLabel pMelhorarTouro7;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCarpricornio1;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoTouro2;
    private javax.swing.JLabel periodoTouro3;
    private javax.swing.JLabel periodoTouro4;
    private javax.swing.JLabel periodoTouro5;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCarpricornio1;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos1;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesTouro2;
    private javax.swing.JLabel pfortesTouro5;
    private javax.swing.JLabel pfortesTouro6;
    private javax.swing.JLabel pfortesTouro7;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCarpricornio1;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaTouro2;
    private javax.swing.JLabel planetaTouro3;
    private javax.swing.JLabel planetaTouro4;
    private javax.swing.JLabel planetaTouro5;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCarpricornio1;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos1;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCarpricornio1;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos1;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeTouro1;
    private javax.swing.JLabel saudeTouro2;
    private javax.swing.JLabel saudeTouro4;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCarpricornio1;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos1;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteTouro1;
    private javax.swing.JLabel sorteTouro2;
    private javax.swing.JLabel sorteTouro4;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCarpricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos1;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixe;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorTouro1;
    private javax.swing.JTextField tfAmorTouro5;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCarpricornio1;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorTouro2;
    private javax.swing.JTextField tfCorTouro3;
    private javax.swing.JTextField tfCorTouro4;
    private javax.swing.JTextField tfCorTouro5;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCarpricornio1;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoTouro2;
    private javax.swing.JTextField tfElementoTouro3;
    private javax.swing.JTextField tfElementoTouro4;
    private javax.swing.JTextField tfElementoTouro5;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumerosAquario;
    private javax.swing.JTextField tfNumerosAries;
    private javax.swing.JTextField tfNumerosCancer;
    private javax.swing.JTextField tfNumerosCarpricornio1;
    private javax.swing.JTextField tfNumerosEscorpiao;
    private javax.swing.JTextField tfNumerosGemeos;
    private javax.swing.JTextField tfNumerosLeao;
    private javax.swing.JTextField tfNumerosLibra;
    private javax.swing.JTextField tfNumerosPeixes;
    private javax.swing.JTextField tfNumerosSagitario;
    private javax.swing.JTextField tfNumerosTouro;
    private javax.swing.JTextField tfNumerosTouro2;
    private javax.swing.JTextField tfNumerosTouro3;
    private javax.swing.JTextField tfNumerosTouro4;
    private javax.swing.JTextField tfNumerosTouro5;
    private javax.swing.JTextField tfNumerosVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCarpricornio1;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoTouro2;
    private javax.swing.JTextField tfPeriodoTouro3;
    private javax.swing.JTextField tfPeriodoTouro4;
    private javax.swing.JTextField tfPeriodoTouro5;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCarpricornio1;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaTouro2;
    private javax.swing.JTextField tfPlanetaTouro3;
    private javax.swing.JTextField tfPlanetaTouro4;
    private javax.swing.JTextField tfPlanetaTouro5;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCarpricornio1;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos1;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudePeixes2;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeTouro1;
    private javax.swing.JTextField tfSaudeTouro2;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCarpricornio1;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSortePeixes2;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteTouro1;
    private javax.swing.JTextField tfSorteTouro2;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCarpricornio1;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos1;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixe;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoTouro1;
    private javax.swing.JTextField tfTrabalhoTouro5;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloAries1;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCaracteristicaAquario;
    private javax.swing.JLabel tituloCaracteristicaAries;
    private javax.swing.JLabel tituloCaracteristicaCancer;
    private javax.swing.JLabel tituloCaracteristicaCarpricornio1;
    private javax.swing.JLabel tituloCaracteristicaEscorpiao;
    private javax.swing.JLabel tituloCaracteristicaGemeos1;
    private javax.swing.JLabel tituloCaracteristicaLeao;
    private javax.swing.JLabel tituloCaracteristicaLibra;
    private javax.swing.JLabel tituloCaracteristicaPeixes;
    private javax.swing.JLabel tituloCaracteristicaSagitario;
    private javax.swing.JLabel tituloCaracteristicaTouro;
    private javax.swing.JLabel tituloCaracteristicaTouro2;
    private javax.swing.JLabel tituloCaracteristicaTouro5;
    private javax.swing.JLabel tituloCaracteristicaTouro6;
    private javax.swing.JLabel tituloCaracteristicaTouro7;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloCarpricornio1;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCarpricornio1;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos1;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro;
    private javax.swing.JLabel tituloEnergiaTouro1;
    private javax.swing.JLabel tituloEnergiaTouro2;
    private javax.swing.JLabel tituloEnergiaTouro4;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries1;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCarpricornio1;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos1;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloTouro2;
    private javax.swing.JLabel tituloTouro3;
    private javax.swing.JLabel tituloTouro4;
    private javax.swing.JLabel tituloTouro5;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCarpricornio1;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos1;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoTouro1;
    private javax.swing.JLabel trabalhoTouro2;
    private javax.swing.JLabel trabalhoTouro4;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCarpricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesTouro2;
    private javax.swing.JTextArea txFortesTouro5;
    private javax.swing.JTextArea txFortesTouro6;
    private javax.swing.JTextArea txFortesTouro7;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCarpricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos1;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarTouro2;
    private javax.swing.JTextArea txMelhorarTouro5;
    private javax.swing.JTextArea txMelhorarTouro6;
    private javax.swing.JTextArea txMelhorarTouro7;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCarpricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibra;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSagitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JTextArea txPrevisaoAquario;
    private javax.swing.JTextArea txPrevisaoAries;
    private javax.swing.JTextArea txPrevisaoCancer;
    private javax.swing.JTextArea txPrevisaoCarpricornio;
    private javax.swing.JTextArea txPrevisaoEscorpiao;
    private javax.swing.JTextArea txPrevisaoGemeos;
    private javax.swing.JTextArea txPrevisaoLeao;
    private javax.swing.JTextArea txPrevisaoLibra;
    private javax.swing.JTextArea txPrevisaoPeixes;
    private javax.swing.JTextArea txPrevisaoSagitario;
    private javax.swing.JTextArea txPrevisaoTouro;
    private javax.swing.JTextArea txPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}

package first;

import java.util.Scanner;

public class QuizSecond {
//　問題文、選択肢、正解の選択肢がどれか（番号で管理）

    static class Question {
        String questionText;
        String[] choices;
        int correctIndex;

        Question(String questionText, String[] choices, int correctIndex) {
            this.questionText = questionText;
            this.choices = choices;
            this.correctIndex = correctIndex;
        }
    }
//エラー１　タイプミス

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = new Question[] {
            new Question("1. 『条件反射』を発見した心理学者は？", 
                new String[]{"フロイト", "パブロフ", "ピアジェ", "スキナー"}, 1),
                
            new Question("2. マズローの欲求階層で最も高いレベルは？",
                new String[]{"安全欲求", "承認欲求", "所属欲求", "自己実現欲求"}, 3),

            new Question("3. フロイトが提唱した心の構造に含まれないものは？",
                new String[]{"エス", "自我", "超自我", "観察我"}, 3),

            new Question("4. 『認知的不協和理論』を提唱したのは？",
                new String[]{"レオン・フェスティンガー", "アルバート・バンデューラ", "ジョン・ワトソン", "ウィリアム・ジェームズ"}, 0),

            new Question("5. 『観察学習』を提唱した心理学者は？",
                new String[]{"エリクソン", "バンデューラ", "ロジャーズ", "ピアジェ"}, 1),

            new Question("6. 『オペラント条件づけ』を提唱した人物は？",
                new String[]{"パブロフ", "スキナー", "フロイト", "エビングハウス"}, 1),

            new Question("7. エビングハウスの研究対象は？",
                new String[]{"夢分析", "記憶の忘却", "知能指数", "行動主義"}, 1),

            new Question("8. ジャン・ピアジェの研究対象は？",
                new String[]{"成人の性格形成", "幼児の発達段階", "夢分析", "精神障害"}, 1),

            new Question("9. 心理的防衛機制の一つ『投影』とは？",
                new String[]{"感情を他人のせいにする", "現実を否定する", "怒りを別の対象に向ける", "行動で取り繕う"}, 0),

            new Question("10. 『自己効力感（self-efficacy）』の概念を提唱したのは？",
                new String[]{"アドラー", "バンデューラ", "ロジャーズ", "ワトソン"}, 1),  

            new Question("11. 『条件反射』はどの動物で発見された？",
                new String[]{"猫", "鳩", "犬", "猿"}, 2),

            new Question("12. ロジャーズが提唱したカウンセリングの基本態度に含まれないのは？",
                new String[]{"共感的理解", "無条件の肯定的関心", "自己一致", "論理的分析"}, 3),

            new Question("13. 『潜在意識』という概念を重視した心理学者は？",
                new String[]{"ワトソン", "フロイト", "ピアジェ", "バンデューラ"}, 1),

            new Question("14. 心理学でいう『知覚の恒常性』とは？",
                new String[]{"注意の持続性", "刺激の変化への反応", "感覚の拡張", "変化しても同じに見える性質"}, 3),

            new Question("15. 『系統的脱感作法』はどのような治療法？",
                new String[]{"うつ病の投薬治療", "不安に対する段階的暴露", "記憶の強化訓練", "夢分析"}, 1),

            new Question("16. 『ヤーキーズ・ドッドソンの法則』が示すのは？",
                new String[]{"ストレスは無意味", "覚醒レベルと作業効率の関係", "学習と年齢の関係", "遺伝の影響"}, 1),

            new Question("17. 心理学における『二重過程理論』とは？",
                new String[]{"記憶の保存方法", "直感と論理の2種類の思考", "夢と現実の区別", "学習の進行パターン"}, 1),

            new Question("18. 『ストループ効果』は何に関係する？",
                new String[]{"視力", "選好判断", "注意と認知の干渉", "身体運動"}, 2),

            new Question("19. エリクソンの発達段階で青年期の課題は？",
                new String[]{"親密性 vs 孤立", "自我同一性 vs 同一性拡散", "信頼 vs 不信", "勤勉性 vs 劣等感"}, 1),

            new Question("20. 『ラポール』とは何を意味する？",
                new String[]{"攻撃性", "信頼関係", "感情転移", "不安の制御"}, 1),
        };

        System.out.println("心理学クイズスタート！（全" + questions.length + "問）");

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("\n" + q.questionText);

            for (int j = 0; j < q.choices.length; j++) {
                System.out.println((j + 1) + ". " + q.choices[j]);
            }

            System.out.print("番号で選んでください（1〜4）: ");
            int answer = scanner.nextInt();

            if (answer - 1 == q.correctIndex) {
                System.out.println("正解です！");
                score++;
            } else {
                System.out.println("間違いです！");
                System.out.println("正解は: " + q.choices[q.correctIndex]);
            }
        }

        System.out.println("\nクイズ終了！あなたの正解数は " + score + " / " + questions.length + " です。");
        scanner.close();
    }
}

package xyz.klinker.wedding.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Guest {
    JAKE_ALLEMAN(1, "Jake Alleman", 16),
    COURTNEY_AND_JON_ANDERSON(2, "Courtney and Jon Anderson", 24),
    DOUG_AND_KIM_ARNDT(3, "Doug and Kim Arndt", 10),
    NAN_ASHBY(4, "Nan Ashby", 25),
    WILLIAM_BENNETT(5, "William Bennett", 14),
    JOSH_AND_NICOLE_BERARD(6, "Josh and Nicole Berard", 6),
    HEIDI_JUSTIN_KRISTA_AND_ELLIE_BOGERS(7, "Heidi, Justin, Krista, and Ellie Bogers", 27),
    AAMON_BOND_AND_MORIAH_JOHNSON(8, "Aamon Bond and Moriah Johnson", 12),
    LORI_AND_BRIAN_BOWMAN(9, "Lori and Brian Bowman", 27),
    JORDAN_BROSI_AND_SHAWN_ZANONI(10, "Jordan Brosi and Shawn Zanoni", 22),
    MATT_AND_JESSICA_BROWN(11, "Matt and Jessica Brown", 6),
    JOHN_AND_ANN_CARL(12, "John and Ann Carl", 21),
    JENNA_CARL_AND_IZAAC_RUTH(13, "Jenna Carl and Izaac Ruth", 21),
    LLOYD_AND_VELMA_CASTON(14, "Lloyd and Velma Caston", 19),
    STEVE_AND_LYNN_COFFIN_AND_FAMILY(15, "Steve and Lynn Coffin and family", 20),
    MAC_AND_LINDA_COFFIN_II(16, "Mac and Linda Coffin II", 20),
    SHAWNA_DAVIS_AND_COURTNEY_AND_BRYNN_CASADY(17, "Shawna Davis and Courtney and Brynn Casady", 15),
    MATT_AND_HOLLY_CROWL(18, "Matt and Holly Crowl", 14),
    TAYLOR_CROWL(19, "Taylor Crowl", 14),
    LOGAN_CROWL(20, "Logan Crowl", 14),
    BUD_AND_ANNE_CROWL(21, "Bud and Anne Crowl", 5),
    KURT_AND_AMY_CROWLKINNEY_AND_FAMILY(22, "Kurt and Amy Crowl-Kinney and family", 5),
    ROSS_BROOKE_ANNA_CUDNEY(23, "Ross, Brooke & Anna Cudney", 7),
    TREVOR_AND_ALEX_CUSHMAN(24, "Trevor and Alex Cushman", 15),
    ALEX_DEMANETT_AND_TYLER_HANSEN(25, "Alex Demanett and Tyler Hansen", 22),
    ROB_DENGLAR(26, "Rob Denglar", 26),
    JESSICA_AND_BO_DENNIS(27, "Jessica and Bo Dennis", 27),
    BRETT_DETERS(28, "Brett Deters", 0),
    KYLE_DOERHOFF(29, "Kyle Doerhoff", 12),
    JOHN_DOWNER(30, "John Downer", 18),
    MICHELLE_DURKIN(31, "Michelle Durkin", 28),
    KIM_DURKIN(32, "Kim Durkin", 28),
    MISS_JULIE_ELSBERRY(33, "Miss Julie Elsberry", 8),
    GEORGE_AND_TERRI_VANHAGEN(34, "George and Terri Vanhagen", 15),
    SONJA_GILBERTSON_AND_JARED_WEBER(35, "Sonja Gilbertson and Jared Weber", 22),
    CHIARA_GIPSON(36, "Chiara Gipson", 22),
    MARK_AND_CATHY_HAGEMEIER_AND_FAMILY(37, "Mark and Cathy Hagemeier and family", 14),
    KYLE_HENNEGHAN_AND_LIZ_HUGHES(38, "Kyle Henneghan and Liz Hughes", 18),
    HATTER_AND_JULIE_HENSLEY(39, "Hatter and Julie Hensley", 20),
    KATHRYN_AND_JAY_HILLS_AND_FAMILY(40, "Kathryn and Jay Hills and family", 11),
    LARRY_AND_ANNE_HYLER(41, "Larry and Anne Hyler", 10),
    KEVIN_JOEL_AND_JEFF_HYLER(42, "Kevin, Joel, and Jeff Hyler", 16),
    MARY_RICHARDS_JILL_SKLER_MELVILLE(43, "Mary Richards Jill & Skler Melville", 4),
    TIM_AND_SUZIE_JOHNSON(44, "Tim and Suzie Johnson", 2),
    MATT_JOHNSON(45, "Matt Johnson", 2),
    CHRISTIAN_JOHNSON(46, "Christian Johnson", 2),
    FRANK_AND_BETTY_JOHNSON(47, "Frank and Betty Johnson", 1),
    STEPHEN_AND_ASHLEY_JOHNSON(48, "Stephen and Ashley Johnson", 7),
    RANDY_AND_JANE_JOHNSON(49, "Randy and Jane Johnson", 10),
    RON_JOHNSON(50, "Ron Johnson", 11),
    ASHLEIGH_JOHNSON(51, "Ashleigh Johnson", 11),
    EMILY_JOHNSON(52, "Emily Johnson", 11),
    ASHLEY_JOHNSON(53, "Ashley Johnson", 0),
    NOAH_REESE_RIDLEY_JOHNSON(54, "Noah, Reese, & Ridley Johnson", 2),
    JOHN_AND_BETHANIE_JOHNSON_AND_FAMILY(55, "John and Bethanie Johnson and family", 1),
    BRITTANY_THOMPSON_KEVIN_HOCKE(56, "Brittany Thompson & Kevin Hocke", 9),
    KEN_AND_MICHELLE_KING(57, "Ken and Michelle King", 6),
    JAN_KLINKER(58, "Jan Klinker", 3),
    MIKE_AND_KRIS_KLINKER(59, "Mike and Kris Klinker", 3),
    AARON_KLINKER(60, "Aaron Klinker", 0),
    ANDREW_KLINKER(61, "Andrew Klinker", 0),
    JAKE_KLINKER(62, "Jake Klinker", 0),
    DIONNA_AND_TALEAH_KNOTTS(63, "Dionna and Taleah Knotts", 21),
    AMY_KOPALE(64, "Amy Kopale", 28),
    NATHAN_AND_KELLI_KOTLEBA_AND_FAMILY(65, "Nathan and Kelli Kotleba and family", 19),
    RUSS_AND_ANNETTE_KUHLEMIER(66, "Russ and Annette Kuhlemier", 20),
    SHERRY_JAMES_LEES(67, "Sherry & James Lees", 25),
    RAE_JON_LANCE_LUDENS(68, "Rae, Jon, & Lance Ludens", 8),
    TIM_AND_LIZA_MADDEN(69, "Tim and Liza Madden", 10),
    BEN_MADDEN(70, "Ben Madden", 0),
    LAUREN_MAJEWSKI(71, "Lauren Majewski", 0),
    PEGGY_AND_FRANK_MAJEWSKI(72, "Peggy and Frank Majewski", 26),
    ERIN_MANFULL_AND_CLAYTON_ADAMS(73, "Erin Manfull and Clayton Adams", 28),
    BRENDEN_MAXWELL_AND_ALEXIS_COULTER(74, "Brenden Maxwell and Alexis Coulter", 15),
    NANCY_SAMMI_AND_MATT_MERRITT(75, "Nancy, Sammi, and Matt Merritt", 3),
    MIKE_MERRITT_AND_LISA_SCHAEG(76, "Mike Merritt and Lisa Schaeg", 6),
    BOB_MEYER(77, "Bob Meyer", 18),
    BONNIE_AND_BOB_MUZIO(78, "Bonnie and Bob Muzio", 7),
    ROCCO_MUZIO(79, "Rocco Muzio", 7),
    JILL_NAGLE(80, "Jill Nagle", 28),
    DYLAN_COURTNEY_AND_TUCKER_NELSON(81, "Dylan, Courtney, and Tucker Nelson", 26),
    MIMI_NIEHAUS(82, "Mimi Niehaus", 2),
    MARCIA_AND_JOHN_OLSEN(83, "Marcia and John Olsen", 17),
    JOSH_AND_ZEKE_OSBORN(84, "Josh and Zeke Osborn", 21),
    OLIVIA_OSBORN(85, "Olivia Osborn", 0),
    ERIC_PAHL_AND_AMANDA_HICKEY(86, "Eric Pahl and Amanda Hickey", 18),
    MARY_AND_SANJEEV_PANDEY(87, "Mary and Sanjeev Pandey", 5),
    AVA_PANDEY(88, "Ava Pandey", 5),
    RAHM_PANDEY(89, "Rahm Pandey", 5),
    KYLE_PLOTSKY(90, "Kyle Plotsky", 18),
    NEIL_AND_KIM_POHREN(91, "Neil and Kim Pohren", 26),
    TYLER_REDMAN(92, "Tyler Redman", 26),
    JESSICA_EMMA_BRENDEN_AND_SAVANNAH_REINEMAN(93, "Jessica, Emma, Brenden, and Savannah Reineman", 8),
    ALLISON_REYHONS(94, "Allison Reyhons", 0),
    JULIE_AND_SCOTT_REYHONS(95, "Julie and Scott Reyhons", 26),
    PERRY_ROBERTS(96, "Perry Roberts", 2),
    BETHANN_MUZIO_RUBEN_ORNELASLUNA(97, "Bethann Muzio & Ruben Ornelas-Luna", 7),
    LILLIAN_RUBIN(98, "Lillian Rubin", 25),
    ROBERT_AND_SUZANNE_RUSSELL(99, "Robert and Suzanne Russell", 25),
    MARCIA_RUTHERFORD(100, "Marcia Rutherford", 17),
    DARRIN_RUTHERFORD(101, "Darrin Rutherford", 17),
    AUSTIN_AND_KRISTIN_RUTHERFORD_AND_FAMILY(102, "Austin and Kristin Rutherford and family", 17),
    KELLY_AND_WILL_SAGER(103, "Kelly and Will Sager", 27),
    TOM_AND_LYNN_SAWYER(104, "Tom and Lynn Sawyer", 25),
    BECKY_SCHEID(105, "Becky Scheid", 13),
    CHRISTY_SCHEID(106, "Christy Scheid", 13),
    JESS_ALISON_SCHEID(107, "Jess & Alison Scheid", 13),
    NICOLE_SCHROEDER_AND_WES_MERRILL(108, "Nicole Schroeder and Wes Merrill", 24),
    KAYLA_SHIPMAN(109, "Kayla Shipman", 24),
    JON_SHUTY(110, "Jon Shuty", 18),
    MAX_SIM(111, "Max Sim", 18),
    RACHEL_SPECTOR(112, "Rachel Spector", 28),
    RILEY_SPITZIG_AND_LEAH_WINCKLER(113, "Riley Spitzig and Leah Winckler", 12),
    ANNIE_STARYKOWICZ(114, "Annie Starykowicz", 16),
    JORDEN_STUDER_AND_SYDNEY_DAVIS(115, "Jorden Studer and Sydney Davis", 12),
    MATT_SWIONTEK(116, "Matt Swiontek", 16),
    TIMOTHY_AND_PATRICE_SWIONTEK(117, "Timothy and Patrice Swiontek", 10),
    KORTNEY_TAYLOR_AND_MARTHA(118, "Kortney Taylor and Martha", 22),
    CARR_AND_ALLYSON_TERPSTRA(119, "Carr and Allyson Terpstra", 4),
    PAUL_AND_JUDY_THOMPSON(120, "Paul and Judy Thompson", 3),
    MARK_AND_ROSEMARY_THOMPSON(121, "Mark and Rosemary Thompson", 9),
    DEAN_AND_BOBBI_THOMPSON(122, "Dean and Bobbi Thompson", 9),
    ERIC_AND_HOLLY_THOMPSON_AND_FAMILY(123, "Eric and Holly Thompson and family", 9),
    TRIMBLE_FAMILY(124, " Trimble Family", 23),
    LINDSEY_VEATCH(125, "Lindsey Veatch", 4),
    SUSAN_VEATCH_DAN_KING(126, "Susan Veatch & Dan King", 3),
    MIKE_WATKINS(127, "Mike Watkins", 16),
    ELYSE_WEBB_AND_ALLYSA_BARBER(128, "Elyse Webb and Allysa Barber", 24),
    NATE_AND_ARI_WELLS(129, "Nate and Ari Wells", 4),
    STEVE_AND_TONYA_WELLS(130, "Steve and Tonya Wells", 3),
    RACHEL_WELLS(131, "Rachel Wells", 4),
    SHAWN_WELLS_AND_LUCY_JOHNSTON(132, "Shawn Wells and Lucy Johnston", 12),
    MIKE_AND_CHRIS_WERNER(133, "Mike and Chris Werner", 13),
    JOHN_WERNER(134, "John Werner", 13),
    TJ_WERNER(135, "TJ Werner", 13),
    CHRISTINA_AND_WES_WHITE(136, "Christina and Wes White", 23),
    CHARISE_AND_CHUCK_WHITE(137, "Charise and Chuck White", 23),
    EDWARD_AND_MARSHA_WHITHAM(138, "Edward and Marsha Whitham", 25),
    KRISTIN_WILSON_AND_BENNETT_MASDEN(139, "Kristin Wilson and Bennett Masden", 28),
    JALEESA_WILSON_AND_DERRICK_DOYLE(140, "Jaleesa Wilson and Derrick Doyle", 21);

    public static List<Guest> list() {
        return Arrays.asList(values());
    }

    public static List<Guest> listBySearch(String search) {
        List<Guest> list = list();
        List<Guest> filtered = new ArrayList<>();

        Guest guest = null;
        for (int i = 0; i < list.size(); i++) {
            guest = list.get(i);

            if (guest.getName().toLowerCase().contains(search)) {
                filtered.add(guest);
            }
        }

        return filtered;
    }

    public static Guest findById(int id) {
        for (Guest guest : list()) {
            if (guest.getId() == id) {
                return guest;
            }
        }

        throw new IllegalArgumentException("No guest matching id " + id);
    }

    private int id;
    private String name;
    private int table;

    Guest(int id, String name, int tableNum) {
        this.id = id;
        this.name = name;
        this.table = tableNum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTable() {
        return table;
    }
}

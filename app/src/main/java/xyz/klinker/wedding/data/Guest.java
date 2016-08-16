package xyz.klinker.wedding.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Guest {
    COURTNEY_AND_JON_ANDERSON(1, "Courtney and Jon Anderson", 24),
    WILLIAM_BENNETT(2, "William Bennett", 14),
    JOSH_AND_NICOLE_BERARD(3, "Josh and Nicole Berard", 6),
    LORI_AND_BRIAN_BOWMAN(4, "Lori and Brian Bowman", 27),
    MATT_AND_JESSICA_BROWN(5, "Matt and Jessica Brown", 6),
    JOHN_AND_ANN_CARL(6, "John and Ann Carl", 21),
    ROB_DENGLAR(7, "Rob Denglar", 26),
    JESSICA_AND_BO_DENNIS(8, "Jessica and Bo Dennis", 27),
    BRETT_DETERS(9, "Brett Deters", 0),
    SONJA_GILBERTSON_AND_JARED_WEBER(10, "Sonja Gilbertson and Jared Weber", 22),
    KATHRYN_AND_JAY_HILLS_AND_FAMILY(11, "Kathryn and Jay Hills and family", 11),
    LARRY_AND_ANNE_HYLER(12, "Larry and Anne Hyler", 10),
    KEVIN_JOEL_AND_JEFF_HYLER(13, "Kevin, Joel, and Jeff Hyler", 16),
    TIM_AND_SUZIE_JOHNSON(14, "Tim and Suzie Johnson", 2),
    MATT_JOHNSON(15, "Matt Johnson", 2),
    CHRISTIAN_JOHNSON(16, "Christian Johnson", 2),
    FRANK_AND_BETTY_JOHNSON(17, "Frank and Betty Johnson", 1),
    STEPHEN_AND_ASHLEY_JOHNSON(18, "Stephen and Ashley Johnson", 7),
    RANDY_AND_JANE_JOHNSON(19, "Randy and Jane Johnson", 10),
    RON_JOHNSON(20, "Ron Johnson", 11),
    ASHLEIGH_JOHNSON(21, "Ashleigh Johnson", 11),
    EMILY_JOHNSON(22, "Emily Johnson", 11),
    ASHLEY_JOHNSON(23, "Ashley Johnson", 0),
    BRITTANY_THOMPSON__KEVIN_HOCKE(24, "Brittany Thompson & Kevin Hocke", 9),
    KEN_AND_MICHELLE_KING(25, "Ken and Michelle King", 6),
    MIKE_AND_KRIS_KLINKER(26, "Mike and Kris Klinker", 3),
    JAKE_KLINKER(27, "Jake Klinker", 0),
    BOB_MEYER(28, "Bob Meyer", 18),
    DYLAN_COURTNEY_AND_TUCKER_NELSON(29, "Dylan, Courtney, and Tucker Nelson", 26),
    KYLE_PLOTSKY(30, "Kyle Plotsky", 18),
    NEIL_AND_KIM_POHREN(31, "Neil and Kim Pohren", 26),
    PERRY_ROBERTS(32, "Perry Roberts", 2),
    LILLIAN_RUBIN(33, "Lillian Rubin", 25),
    ROBERT_AND_SUZANNE_RUSSELL(34, "Robert and Suzanne Russell", 25),
    NICOLE_SCHROEDER_AND_WES_MERRILL(35, "Nicole Schroeder and Wes Merrill", 24),
    MAX_SIM(36, "Max Sim", 18),
    PAUL_AND_JUDY_THOMPSON(37, "Paul and Judy Thompson", 3),
    _STUART_FAMILY(38, " Stuart Family", 23),
    SUSAN_VEATCH__DAN_KING(39, "Susan Veatch & Dan King", 3),
    MIKE_WATKINS(40, "Mike Watkins", 16),
    STEVE_AND_TONYA_WELLS(41, "Steve and Tonya Wells", 3),
    RACHEL_WELLS(42, "Rachel Wells", 4);

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

    public static List<Guest> listByTableAndExclude(int tableNumber, Guest exclude) {
        List<Guest> list = list();
        List<Guest> filtered = new ArrayList<>();

        Guest guest = null;
        for (int i = 0; i < list.size(); i++) {
            guest = list.get(i);

            if (guest.getTable() == tableNumber && guest != exclude) {
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

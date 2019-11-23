typedef struct Schools
{
    int number;         //学校编号
    int total_Score;//学校总得分
    int maleAndFemaleGroupTotalScore;//男女团体总得分
    struct School *next;
}School;
typedef struct Sportsmans
{
    char name[];//名字
    char sex[];//性别
    int number;//学校编号
    char school_Name[];//学校名字
    int score; //个人得分
    int rank; //个人排名
    int item_number//项目编号
    struct Sportsman *next;
}Sportsman;
typedef struct Items
{
    int item_Number; //项目编号
    int name;  //项目名字
    int sort; //项目类别
    struct Item *next;
}Item;


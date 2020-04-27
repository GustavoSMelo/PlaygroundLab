using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnumScript : MonoBehaviour
{

    enum AI { atk, run, heal, spell_magic, invoke_troop }
    Dictionary<string, AI> enemys = new Dictionary<string, AI>();
    void Start()
    {
        enemys.Add("necromancer", AI.invoke_troop);
        enemys.Add("mage", AI.spell_magic);
        enemys.Add("healer", AI.heal);
        enemys.Add("undead_knight", AI.atk);

        AI necromancer = AI.invoke_troop;
        AI mage = AI.spell_magic;
        AI healer = AI.heal;
        AI undeand_knight = AI.heal;

        print(necromancer);
        print(mage);
        print(healer);
        print(undeand_knight);

    }

    void Update()
    {

    }
}

package com.vademecum.data;

import com.vademecum.model.Medicamento;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicamentosData {

    public static List<Medicamento> cargarMedicamentos() {
        List<Medicamento> lista = new ArrayList<>();

        // ── PÁGINA 1 ──────────────────────────────────────────────────────────

        lista.add(new Medicamento("001", "Abrotanum summitates", "Artemisia abrotanum",
                "Dil. D1, D2, D3, D4, D6", "Compuestas",
                Arrays.asList("TBC", "Asma", "Parásitos intestinales", "Nevos", "Flameos", "Marasmo", "Hidrocele en niños"),
                "Estimula la acción del cuerpo astral en el sentido de la secreción.",
                "Coadyuvante en TBC y Asma. D1: Parásitos intestinales. Nevos. Flameos. Depresión calórica proteica en niños con retardo de crecimiento. Atrofia corporal progresiva con conservación del apetito y de la lucidez mental (Marasmo). Hidrocele en niños.",
                "—", "—", "Dil. D1, D2, D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("002", "Abrotanum compuesto",
                "Abrotanum summitates / Árnica / Petroleum / Pulsatilla / Sulfur",
                "D3 / D4 / D8 / D8 / D8 aa.", "Compuesto",
                Arrays.asList("Sabañones"),
                "Combinación de Abrotanum summitates D3, Árnica pl.tota D4, Petroleum D8, Pulsatilla pl.tota D8 y Sulfur D8 aa.",
                "Sabañones.", "—", "—", "Según indicación.", "—",
                "Medicina Antroposófica / Compuestos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("003", "Abrotanum comp. Ungüento",
                "Abrotanum summitates / Árnica / Bálsamo de Tolú / Ol. aeth. Rosmarini / Petroleum / Stibium met.praep.",
                "TM / TM / — / — / 100% / D1", "Ungüento",
                Arrays.asList("Sabañones", "Congelamiento"),
                "Ungüento compuesto. Excip.c.s.p 100,0 g.",
                "Sabañones. Congelamiento.", "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("004", "Absinthium herba", "Artemisia absinthium",
                "Dil. D1, D2, D3, D4, D6", "Compuestas",
                Arrays.asList("Anorexia", "Dispepsia", "Hipoacidez gástrica", "Hiperacidez gástrica", "Pereza hepática", "Pereza vesicular", "Epilepsia"),
                "Regulariza la acción del Yo y el cuerpo astral en el aparato digestivo.",
                "Anorexia. Dispepsia. Hipoacidez o Hiperacidez gástrica. \"Pereza\" hepática y vesicular. Aumenta la energía y el gozo de vivir. Acrecienta las autodefensas. Epilepsia. Ver también: Cocculus/Oleum Petrae comp., Artemisia comp., Gotas Amara.",
                "—", "—", "Dil. D1, D2, D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("005", "Absinthium D3 / Resina Laricis D3 aa Dil.",
                "Herba / Resina de larice", "D3 aa Dil.", "Dilución compuesta",
                Arrays.asList("Enfermedades reumáticas", "Iritis crónica", "Patologías metabólicas degenerativas", "Enfermedades de hígado", "Conmoción cerebral", "Supuraciones crónicas", "Diabetes"),
                "Combinación de Absinthium D3 y Resina Laricis D3 aa.",
                "Coadyuvante en enfermedades reumáticas. Iritis crónica. Activación del metabolismo en patologías metabólicas degenerativas con formación de depósitos. Coadyuvante en tratamiento de hígado. Período alejado de la conmoción cerebral. Supuraciones crónicas. Diabetes.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Diluciones compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("006", "Acidum Hydrochloricum", "Ácido muriático / Ácido clorhídrico",
                "Dil. D4, D6, D8, D30", "Compuestas",
                Arrays.asList("Úlceras bucales", "Aftas", "Aquilia gástrica", "Estados adinámicos", "Fiebre tifoidea", "Diarrea hemorrágica", "Hemorroides", "Prolapso anal", "Prolapso rectal", "Escarlatina", "Difteria"),
                "Rango homeopático: estados adinámicos con gran postración y fiebre alta.",
                "Úlceras bucales. Aftas. D2: Aquilia gástrica. Estados adinámicos, generalmente con fiebre alta, gran postración casi paralítica. Gran inquietud y congestión, a menudo con incontinencia de orina y materias fecales. Diarrea con heces abundantes oscuras o hemorrágicas. Hemorroides. Prolapso anal o rectal al orinar o con diarrea. Fiebre tifoidea o Síndromes tíficos de la Escarlatina y Difteria graves.",
                "—", "—", "Dil. D4, D6, D8, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 6 ──────────────────────────────────────────────────────────

        lista.add(new Medicamento("007", "Acidum hydrofluoricum", "Acidum fluoricum / Ácido fluorhídrico",
                "Dil. D6, D8, D30", "Compuestas",
                Arrays.asList("Esclerodermia", "Afecciones óseas", "Caries", "Necrosis ósea", "Osteitis", "Periostitis", "Fístulas óseas", "Fístulas dentarias", "Fístulas anales", "Várices", "Úlceras varicosas crónicas", "Alopecia areata"),
                "—",
                "Esclerodermia. Niños con intelectualidad precoz. Afecciones óseas. Caries y Necrosis óseas. Osteitis y Periostitis. Fístulas óseas. Fístulas dentarias, anales. Várices. Úlceras varicosas crónicas. Alopecia areata.",
                "—", "—", "Dil. D6, D8, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("008", "Acidum nitricum", "Ácido nítrico",
                "Dil. D3, D6, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Condilomas", "Aftas", "Ulceraciones", "Verrugas", "Hemorroides sangrantes", "Fisura anal", "Lesiones cutáneo-mucosas"),
                "La relación de lo ácido con el cuerpo astral se intensifica por la presencia de nitrógeno.",
                "Dolores punzantes como astilla clavada al menor roce, presión o movimiento, de aparición y desaparición repentina. Lesiones en zonas cutáneo-mucosas. Con Thuja y Staphisagria integra el trío homeopático para condilomas. Aftas. Ulceraciones. Verrugas. Hemorroides sangrantes. Fisura anal. Pediatría: D3 alternando con Ratanhia D3 en fisura anal. Tipología: irritable, colérico, vengativo, testarudo, gran postración mental e inquietud por su salud.",
                "—", "—", "Dil. D3, D6, D12, D15, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("009", "Acidum phosphoricum", "Phosphoricum acidum",
                "Dil. D3, D4, D6, D8, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Neurastenia", "Taquicardia", "Fosfaturia", "Debilidad física y anímica", "Diarrea aguda", "Diarrea crónica", "Diabetes", "Flatos vaginales", "Impotencia", "Eyaculación precoz"),
                "Por lo ácido el phosphorus es guiado hacia el cuerpo astral. Por su contenido en hidrógeno tiene relación con el éter calórico.",
                "Debilidad física y anímica por problemas emocionales. Fosfaturia. D3: Neurastenia. Taquicardia. Rango homeopático: debilitamiento o agotamiento nervioso, indiferencia, apatía, en los grados extremos estado estuporoso. Lentitud y torpeza intelectual. Concentración dificultosa, memoria escasa. Nostalgias (con Capsicum en hospitalismo). Dolores de crecimiento. Debilidad paralítica. Diarrea aguda o crónica, abundante, acuosa, indolora, materias fecales sin olor. Diarreas que no debilitan. Diabetes. Flatos vaginales. Impotencia, eyaculación precoz, tendencia a la masturbación.",
                "—", "—", "Dil. D3, D4, D6, D8, D12, D15, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("010", "Acidum sulfuricum", "Ácido sulfúrico",
                "Dil. D6, D12, D30", "Compuestas",
                Arrays.asList("Alcoholismo agudo", "Alcoholismo crónico", "Traumatismo con extravasación sanguínea", "Esclerosis múltiple", "Aftas en niños", "Hemorroides"),
                "—",
                "Alcoholismo agudo y crónico. (Ver Minium). Traumatismo con extravasación sanguínea. D2: esclerosis múltiple (con Zincum 0,4% Ung. en la frente y Cuprum 0,4% Ung. en la planta de los pies). D6: Aftas en niños. Hemorroides.",
                "—", "—", "Dil. D6, D12, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("011", "Aconitum napellus planta tota", "Ranunculáceas / Aconito",
                "Dil. D3, D4, D6, D10, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Pródromos de enfermedad infecciosa", "Fiebre", "Neuralgias", "Herpes zoster", "Trigémino", "Espasmos musculares", "Estados de miedo", "Shock", "Estados gripales", "Bronquitis", "Neumonías", "Reumatismo", "Fiebre", "Neuritis", "Cor nervosum", "Taquicardia", "Pavor nocturno", "Angustia cardíaca"),
                "—",
                "Pródromos de enfermedad infecciosa acompañada de fiebre. Neuralgias, herpes zoster, trigémino. Espasmos de la musculatura lisa, especialmente gástrica. Estados de miedo, sobre todo los relacionados con vivencias de shock. Estados gripales (ver también Bryonia/Eupatorium comp.). Bronquitis y Neumonías. Reumatismo. D3: Fiebre. Dil. D6 o D20: Neuritis. Neuralgias. D6: Cor nervosum, dolor pulpítico punzante. D10-D15: Taquicardia. D15: Pediatría: Histeria. Estimula la actividad formativa del sistema neurosensorial, especialmente en el metabolismo y actúa contra la temerosidad. D30: Pavor nocturno. Angustia cardíaca.",
                "—", "—", "Dil. D3, D4, D6, D10, D12, D15, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 7 ──────────────────────────────────────────────────────────

        lista.add(new Medicamento("012", "Aconitum / Árnica / Betula comp. Dil. (Rheumodoron 102 A)",
                "Aconitum napellus pl.tota / Árnica pl.tota / Betula folium / Mandrágora radix",
                "D3 10,0g / TM 37,5g / D1 12,0g / D1 3,0g — Excip.c.s.p 100,0g", "Dilución compuesta",
                Arrays.asList("Artritis reumatoidea", "Artrosis"),
                "—",
                "Artritis reumatoidea (también las componentes aisladas en diferentes dinamizaciones). Artrosis.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("013", "Aconitum / Arnica / Bryonia Dil. (Rheumodoron 1)",
                "Aconitum napellus pl.tota / Arnica pl.tota / Bryonia radix",
                "D3 10,0g / D1 10,0g / D2 10,0g — Excip.c.s.p 100,0g", "Dilución compuesta",
                Arrays.asList("Reumatismo articular agudo", "Reumatismo articular subagudo", "Artritis reumatoidea", "Artrosis"),
                "—",
                "Reumatismo articular agudo y subagudo, trastornos del tejido conectivo asociado a patologías articulares inflamatorias. Artritis reumatoidea, artrosis. Alternar con Colchicum/Sabina.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("014", "Aconitum / Bryonia Dil. (Pneumodoron 1)",
                "Aconitum napellus pl.tota / Bryonia radix",
                "D2 5,0g / D2 10,0g — Excip.c.s.p 100,0g", "Dilución compuesta",
                Arrays.asList("Bronquitis aguda febril", "Neumonía"),
                "—",
                "Bronquitis aguda, febril. Neumonía. Alternar con Phosphorus/Tartarus Stibiatus.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("015", "Achillea comp. Dil.",
                "Achillea millefolium herba / Aesculus cortex / Antimonita / Gentiana radix / Hamamelis cortex",
                "D1 / D3 / D8 / D3 / D3 aa", "Dilución compuesta",
                Arrays.asList("Hemorroides", "Eczema anal", "Fístulas", "Proctitis", "Fisura anal"),
                "—",
                "Hemorroides. Eczema anal. Fístulas. Proctitis. Fisura anal.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("016", "Adonis vernalis herba et flos",
                "Adonis u ojo de perdiz / Ranunculáceas", "Dil. D6", "Compuestas",
                Arrays.asList("Insuficiencia cardíaca leve", "Arritmias", "Manifestaciones anginosas", "Estados de agotamiento"),
                "Armonización de la acción conjunta de las organizaciones sensible y vital en el sistema cardiocirculatorio.",
                "Formas leves de insuficiencia cardíaca con alteraciones del ritmo y manifestaciones anginosas. Estados de agotamiento. Tónico cardíaco.",
                "—", "—", "Dil. D6 según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 8 ──────────────────────────────────────────────────────────

        lista.add(new Medicamento("017", "Aesculus Cortex", "Castaño de Indias / Hypocastáneas",
                "Dil. D1, D2, D3, D4, D6, D10, D15, D20", "Compuestas",
                Arrays.asList("Enfermedades venosas", "Edema venoso", "Plétora venosa", "Hemorroides", "Várices", "Braquialgia parestésica nocturna", "Caries agudas", "Dolor sacroilíaco", "Lumbosacralgias"),
                "Estimulación y estructuración del organismo acuoso.",
                "Enfermedades venosas con edema. Plétora venosa. Hemorroides. Várices. Ver también Achillea comp. y Gotas para várices, Borago comp. Dil D1, D2, D3: Braquialgia parestésica nocturna. D3: Caries agudas. Rango homeopático: El recto es su principal sitio de acción, dolor punzante, ardiente a veces pruriginoso. Dolor en articulación sacroilíaca, sacralgias o lumbosacralgias que empeoran por el movimiento.",
                "—", "—", "Dil. D1–D20 según indicación.", "—",
                "Medicina Antroposófica / Venosos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("018", "Aesculus D15 / Alumen D15 aa Dil.", "Aesculus / Alumen",
                "D15 aa", "Dilución compuesta",
                Arrays.asList("Eczema húmedo", "Acné rosácea"),
                "—", "Eczema húmedo. Acné rosácea.",
                "—", "—", "D15 aa según indicación.", "—",
                "Medicina Antroposófica / Dermatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("019", "Agaricus Muscarius", "Agarico pintado / Hongo loco",
                "Dil. D3, D6, D8, D10, D12, D20, D30", "Compuestas",
                Arrays.asList("Enfermedades degenerativas del sistema nervioso", "Enfermedades inflamatorias del sistema nervioso", "Post-apoplejía", "Escarlatina en adultos", "Neuralgia del trigémino", "Psoriasis", "Estadios post-apopléticos"),
                "Estimulación de procesos estructurantes en enfermedades degenerativas e inflamatorias del sistema nervioso y óseo.",
                "D6, D10: Post-apoplejía. D10: Escarlatina en adultos. D30: Neuralgia del trigémino. Ver también Mygale comp. D30: Estadios post-apopléticos (periférico). D10: Psoriasis.",
                "—", "—", "Dil. D3–D30 según indicación.", "—",
                "Medicina Antroposófica / Neurológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("020", "Agaricus compuesto",
                "Agaricus muscarius / Aspidium filix mas-spora / Argentum met. praep. / Conchae",
                "D8 / D3 / D8 / D8 aa.", "Compuesto",
                Arrays.asList("Osteomielitis", "Tuberculosis ósea"),
                "—", "Osteomielitis, tuberculosis ósea.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Óseos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("021", "Agnus castus fructus", "Vitex agnus castus / Sauzgatillo / Árbol casto / Verbenáceas",
                "Dil. D3, D4, D6", "Compuestas",
                Arrays.asList("Hipogalactia", "Depresión", "Reglas suprimidas", "Espermatorrea", "Neurastenia", "Falta de deseo sexual", "Dolores testiculares"),
                "—",
                "D3: Estimula la secreción láctea. D6: Depresiones. Reglas suprimidas, disminución o falta de leche en mujeres que crían, tristeza, espermatorrea, neurastenia, falta de deseo sexual, dolores testiculares.",
                "—", "—", "Dil. D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Ginecológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("022", "Agnus castus comp. Dil.",
                "Agnus castus fructus / Caulophyllum rhiz. / Chamomilla radix / Equisetum arvense herba / Ignatia semen / Kalium carbonicum / Lilium tigrinum pl.tota / Zincum valerianicum",
                "D1 / D4 / D3 / D4 / D6 / D6 / D3 / D4", "Dilución compuesta",
                Arrays.asList("Síndrome premenstrual", "Estado carencial del cuerpo lúteo", "Jaqueca de origen ovárico"),
                "—",
                "Síndrome premenstrual. Estado carencial del cuerpo lúteo. Jaqueca: formas de origen ovárico.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Ginecológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 4 (imagen 4) ───────────────────────────────────────────────

        lista.add(new Medicamento("023", "Álkali compuesto D6", "—", "D6", "Trituración",
                Arrays.asList("Ver indicación específica"),
                "—", "Trituración D6.", "—", "—", "D6 Trituración.", "—",
                "Medicina Antroposófica / Trituras", "Vademécum Antroposófico"));

        lista.add(new Medicamento("024", "Allium sativa", "Ajo",
                "Dil. D1, D2, D4, D6", "Compuestas",
                Arrays.asList("Trastornos digestivos por ingesta excesiva", "Parasitosis"),
                "—", "Trastornos digestivos por ingesta excesiva, parasitosis.",
                "—", "—", "Dil. D1, D2, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("025", "Alumen", "Alumbre romano",
                "Dil. D3, D6, D15", "Compuestas",
                Arrays.asList("Constipación", "Flujo escoriante", "Sinusitis crónica", "Acné rosácea", "Eczema húmedo"),
                "—",
                "Constipación. Flujo escoriante. Ver también: Mixtura Stanni comp. Alumen/Berberis comp. D3: Sinusitis crónica (junto con Kalium bichromicum D6). D15: Acné rosácea. Eczema húmedo (junto con Aesculus cortex D15).",
                "—", "—", "Dil. D3, D6, D15 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("026", "Alumen / Berberis comp. Dil.",
                "Alumen / Berberis fructus / Helleborus niger pl.tota",
                "D3 / D3 / D3 aa.", "Dilución compuesta",
                Arrays.asList("Esterilidad", "Dificultades para concebir"),
                "—", "Para favorecer la concepción. Esterilidad.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Ginecológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("027", "Alumina", "Óxido de aluminio",
                "Trit. D3, D4, D6 / Dil. D30", "Compuestas",
                Arrays.asList("Constipación atónica", "Parálisis", "Paresias de recto", "Flujo vaginal abundante", "Sequedad de piel y mucosas", "Confusión de identidad", "Angustia", "Debilidad extrema"),
                "—",
                "Confusión sobre su identidad personal. Sentimiento de culpa con ansiedad, angustia, tristeza. Impulso irracional de matar o matarse. Debilidad, agotamiento, cansancio hasta para hablar. Parálisis o paresias de recto, vejiga y miembros. Constipación atónica por inactividad rectal. Heces caprinas. Flujo vaginal abundante, excoriante. Sequedad extrema de piel y mucosas. La acción del medicamento es muy lenta.",
                "—", "—", "Trit. D3, D4, D6 / Dil. D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("028", "Ammonium carbonicum", "Carbonato de amonio",
                "Dil. D4, D6, D12", "Compuestas",
                Arrays.asList("Bronquitis"),
                "—", "Bronquitis. Ver también Echinacea comp.",
                "—", "—", "Dil. D4, D6, D12 según indicación.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("029", "Anacardium Orientalis", "Anacardiáceas / Nuez de Pantano",
                "Dil. D3, D6, D20, D30", "Compuestas",
                Arrays.asList("Pérdida de memoria", "Estados esquizoideos", "Dispepsia gástrica", "Inseguridad", "Indecisión"),
                "—",
                "Pérdida de memoria después de excesivo trabajo mental o de aparición brusca. Inseguridad, indecisión. Estados esquizoideos con sensación de tener dos voluntades opuestas. Compulsión por maldecir, blasfemar, insultar. Sin motivo se muestra cruel, perverso, vengativo, rencoroso. Con impulsos contradictorios. Dispepsia gástrica que mejora comiendo.",
                "—", "—", "Dil. D3, D6, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Neurológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 5 (imagen 5) ───────────────────────────────────────────────

        lista.add(new Medicamento("030", "Anagallis herba planta tota", "Primuláceas / Pimpinela azul",
                "Trit. 5% / Dil. D3, D4, D6", "Compuestas",
                Arrays.asList("Ampollas supurantes en manos y pies", "Espasmos intestinales", "Irritación nerviosa del intestino", "Cólicos infantiles", "Dismenorrea"),
                "—",
                "Tratamiento coadyuvante en ampollas supurantes en plantas de manos y pies, en relación a patología digestiva. Espasmos intestinales. Irritación nerviosa del intestino. Cólicos infantiles. Dismenorrea.",
                "—", "—", "Trit. 5% / Dil. D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("031", "Anagallis/Malaquita compuesta",
                "Anagallis herba / Chamomilla pl.tota / Malaquita / Kalium aceticum compuesto",
                "D3 / D3 / D6 / D6 aa.", "Dilución compuesta",
                Arrays.asList("Gastritis", "Duodenitis", "Úlceras pépticas", "Enfermedades inflamatorias gastrointestinales"),
                "—",
                "Armonización de la secreción y motilidad en el tracto gastrointestinal en enfermedades inflamatorias y espásticas, ej. gastritis, duodenitis, úlceras pépticas.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("032", "Anís – Pirita D3 Trit.",
                "Pimpinella anisum fructus tostus / Pirita / Saccharum tostum",
                "— / D3 / aa", "Trituración",
                Arrays.asList("Bronquitis aguda", "Ronquera", "Carraspera"),
                "—", "Bronquitis Aguda. Ronquera. Carraspera. Ver también Pirita.",
                "—", "—", "Trit. D3 según indicación.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("033", "Antimonita", "Sulfuro natural de antimonio",
                "Dil. D6, D8, D10, D12, D20, D30 / Trit. D3, D4, D6, D8, D10, D12 / Ung. 0,4%", "Compuestas",
                Arrays.asList("Poliartritis primaria crónica", "Apendicitis", "Acné rosácea", "Eczema seco", "Úlcus duodenal", "Lupus eritematoso", "Prurito senil", "Dolores fantasmas", "Trombopenia", "Blefaritis", "Trastornos gástricos", "Varicela"),
                "Estibina. Antimonium crudum.",
                "D4 Trit., D6 Poliartritis primaria crónica. Apendicitis. D6 Trit.: Acné rosácea. Eczema seco. Ulcus duodenal. Lupus eritematoso (junto con Formica D3). D12: Prurito senil. D20: Dolores fantasmas. Trit. D3: Trombopenia. Ung: Blefaritis. Rágades de comisuras labiales. Rango homeopático: El estómago es el centro de acción. Trastornos gástricos. Indigestiones. Eructos. Náuseas. Vómitos. Catarros gástricos. Vómitos en el Sarampión. Piel dura con espesamiento, callosidades, induraciones. Adultos sentimentales, trastornos por amores no correspondidos. La luz de luna agrava sus síntomas mentales. Gran tristeza. Cansado de la vida con pensamientos suicidas. Pediatría: niños excesivamente malhumorados, irritables, disconformes, contradictorios, con aversión a que los toquen y que los miren. Varicela.",
                "—", "—", "Dil. D6–D30 / Trit. D3–D12 / Ung. 0,4% según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("034", "Antimonita compuesta",
                "Antimonita / Corallium rubrum / Belladonna pl.tota / Echinacea pl.tot / Oleum aeth. Rosae",
                "D6 / D6 / D12 / D3 / — Excipientes c.s.p.", "Compuesto",
                Arrays.asList("Hemorragias dentales", "Buches"),
                "—", "Hemorragias dentales, buches.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Odontológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 6 (imagen 6) ───────────────────────────────────────────────

        lista.add(new Medicamento("035", "Apatita", "Fluorofosfato natural de calcio",
                "Dil. D8, D12, D15 / Trit. D3, D4, D6", "Compuestas",
                Arrays.asList("Osteoporosis", "Raquitismo", "Trastornos de mineralización ósea"),
                "Estimulación del intercambio del calcio en los trastornos de la mineralización ósea.",
                "D3: Osteoporosis. D6: Raquitismo.",
                "—", "—", "Dil. D8, D12, D15 / Trit. D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Óseos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("036", "Apatita D6 / Arandisita D6 aa Trit.", "Apatita / Arandisita",
                "D6 aa", "Trituración compuesta",
                Arrays.asList("Artrosis", "Osteoporosis"),
                "—", "Artrosis, Osteoporosis.",
                "—", "—", "D6 aa Trit. según indicación.", "—",
                "Medicina Antroposófica / Óseos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("037", "Apatita D6 comp. Trit. (Calcio 1 / Calciodoron I)",
                "Apatita / Cucurbita flos", "D6 / D3 aa", "Trituración compuesta",
                Arrays.asList("Desnutrición juvenil", "Formación de huesos y dientes", "Asimilación insuficiente de alimentos", "Crecimiento insuficiente", "Tetania"),
                "Activación del metabolismo cálcico.",
                "Activación del metabolismo cálcico: en manifestaciones de desnutrición, sobre todo juvenil. Durante el embarazo. Como apoyo de la formación de huesos y dientes. Asimilación insuficiente de alimentos. Crecimiento insuficiente. Tetania. Alternar con Conchae 5% comp.",
                "—", "—", "D6 aa Trit. según indicación.", "—",
                "Medicina Antroposófica / Óseos / Pediatría", "Vademécum Antroposófico"));

        lista.add(new Medicamento("038", "Apatita / Phosphorus comp. L. Dil. (Lactante)",
                "Apatita / Phosphorus", "D8 66,7g / D6 33,3g", "Dilución compuesta",
                Arrays.asList("Profilaxis del raquitismo en lactantes"),
                "—",
                "Pediatría: Profilaxis del Raquitismo en lactantes, de mañana. (Conchae/Quercus comp. L de noche). Indicaciones en adultos: las que surjan del Fluorofosfato de Calcio y del Fósforo.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Pediatría", "Vademécum Antroposófico"));

        lista.add(new Medicamento("039", "Apatita / Phosphorus comp. N. Dil. (Niños)",
                "Apatita / Cucurbita flos / Ferrum sidereum / Phosphorus",
                "D8 / D4 / D20 / D6 aa", "Dilución compuesta",
                Arrays.asList("Profilaxis del raquitismo en niños"),
                "—",
                "Pediatría: Profilaxis del raquitismo en niños, de mañana (Conchae/Quercus comp. niños de noche).",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Pediatría", "Vademécum Antroposófico"));

        lista.add(new Medicamento("040", "Apatita D6 / Stannum D8 aa Trit.", "Apatita / Stannum",
                "D6 / D8 aa", "Trituración compuesta",
                Arrays.asList("Gonartrosis", "Artrosis deformante", "Enfermedad de Perthes", "Osteocondrosis", "Enfermedad de Schlatter"),
                "—",
                "Gonartrosis. Artrosis deformante. Enfermedad de Perthes. Osteocondrosis. Enfermedad de Schlatter.",
                "—", "—", "D6/D8 aa Trit. según indicación.", "—",
                "Medicina Antroposófica / Óseos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("041", "Apis mellifica", "Abeja",
                "Dil. D3, D4, D6, D8, D10, D12, D15, D20, D30 / Ung. 1%", "Compuestas",
                Arrays.asList("Inflamaciones circunscritas", "Bursitis", "Quiste ovárico", "Nefritis", "Síndrome nefrítico", "Asma", "Neuritis", "Herpes Zoster", "Rinitis vasomotora", "Edema de glotis", "Escleritis reumática"),
                "Armonización del organismo calórico en inflamaciones circunscritas, así como alteraciones de la organización metabólica periférica.",
                "D3: Bursitis (junto con Bryonia D3). D6: Quiste ovárico. D6: Nefritis que va a síndrome nefrítico. D10-D15: Asma (organismo calórico). D10-D30: Neuritis. Herpes Zoster. D20: Rinitis vasomotora. D30: Pediatría: Asma \"por la mañana\". Chamomilla radix D1 \"por la noche\". D30 Amp.: Rinitis vasomotora. Edema de glotis. Escleritis reumática (o bien Formica o Vespa).",
                "—", "—", "Dil. D3–D30 / Ung. 1% según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 7 (imagen 7) ───────────────────────────────────────────────

        lista.add(new Medicamento("042", "Apis mellifica D3 / Belladonna pl.tota D3 aa Dil. (Erysidoron 1)",
                "Apis mellifica / Belladonna pl.tota", "D3 aa", "Dilución compuesta",
                Arrays.asList("Procesos febriles e inflamatorios", "Inflamaciones locales", "Supuraciones"),
                "—",
                "Procesos febriles e inflamatorios. Inflamaciones locales, supuraciones. En caso de síntomas tóxicos alternar con Carbo Betulae/Sulfur.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Compuestos Febriles", "Vademécum Antroposófico"));

        lista.add(new Medicamento("043", "Apis / Berberis / Hydrastis",
                "Apis mellifica / Berberis fructus / Hydrastis canadensis",
                "D3 / D3 / D4 aa.", "Dilución compuesta",
                Arrays.asList("Sinusitis", "Catarros"),
                "—", "Sinusitis, catarros.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("044", "Apis / Cepa / Hydrastis",
                "Apis mellifica / Cepa bulbus / Hydrastis canadensis",
                "D6 / D4 / D4 aa", "Dilución compuesta",
                Arrays.asList("Coriza", "Catarro de mucosas"),
                "—", "Coriza, catarro de mucosas.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("045", "Apis / Formica Ung.",
                "Apis mellifica / Formica", "D1 / D1 — Excipientes c.s.p.", "Ungüento",
                Arrays.asList("Inflamaciones", "Artrosis", "Lumbalgia"),
                "—", "Inflamaciones, artrosis, lumbalgia.",
                "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("046", "Apis / Rhus toxicodendron comp. Dil.",
                "Apis mellifica / Rhus toxicodendron folium / Bryonia radix",
                "D3 / D4 / D3 aa", "Dilución compuesta",
                Arrays.asList("Ciatalgia", "Lumbago", "Epicondilitis"),
                "—", "Ciatalgia. Lumbago. Epicondilitis.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("047", "Apocynum cannabinum rhizoma", "Apocináceas / Cáñamo del Canadá",
                "Dil. D2, D3, D4, D6", "Compuestas",
                Arrays.asList("Edemas", "Hidropesía"),
                "—",
                "Edemas (pacientes con sed). Apis Mellifica: lo opuesto. Hidropesía.",
                "—", "—", "Dil. D2, D3, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("048", "Arandisita", "Silicato natural de estaño",
                "Dil. D8, D10, D15, D20, D30 / Trit. D6", "Compuestas",
                Arrays.asList("Enfermedades hepáticas orgánicas", "Trastornos bipolares", "Postencefalitis", "Hidrocefalia", "Enfermedades degenerativas de columna vertebral", "Eczema", "Espondiloartrosis", "Artrosis", "Hernia", "Periostitis", "Manía", "Descenso vaginal"),
                "Actúa sobre el metabolismo hepático en el organismo acuoso, con tendencias solidificantes y deformantes.",
                "Enfermedades hepáticas orgánicas, trastornos bipolares (maníaco y depresivo). Síndrome postencefalitis. Hidrocefalia. Enfermedades degenerativas de la columna vertebral y articulaciones. Eczema. Espondiloartrosis. D6: Artrosis. Enfermedad de Schlatter (junto con Apatita/Stannum). Hernia. Periostitis. Manía. D10: Descenso vaginal.",
                "—", "—", "Dil. D8–D30 / Trit. D6 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 8 (imagen 8) ───────────────────────────────────────────────

        lista.add(new Medicamento("049", "Archangelica radix", "Umbelíferas / Angélica",
                "Dil. D1, D2, D3, D6 / Ung. 5%, 10%", "Compuestas",
                Arrays.asList("Hipertrofia de amígdalas y adenoides", "Constitución linfática", "Parotiditis epidémica", "Angina monocítica", "Mononucleosis", "Adenitis", "Adenopatías"),
                "—",
                "Hipertrofia de amígdalas y adenoides. Constitución linfática. Parotiditis epidémica. D2 o D3: Angina monocítica, con Mercurius vivus D6. D3: Mononucleosis. Ung: Adenitis, Parotiditis epidémica. Amigdalitis. Adenopatías por anginas. Mononucleosis, retenciones linfáticas. En Homeopatía: se usa TM pues puede producir aversión a las bebidas alcohólicas.",
                "—", "—", "Dil. D1–D6 / Ung. 5%, 10% según indicación.", "—",
                "Medicina Antroposófica / Inmunológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("050", "Argentita", "Sulfuro natural de plata",
                "Dil. D6, D12, D15, D20, D30 / Trit. D4, D6", "Compuestas",
                Arrays.asList("Estreñimiento crónico", "Litiasis", "Anexitis", "Epicondilitis", "Retención de loquios", "Prostatitis aguda", "Eczemas secos", "Neurodermitis", "Shock psíquico", "Insuficiencia renal", "Anuria", "Artrosis deformante", "Rinitis atrófica", "Sinusitis crónica", "Asma"),
                "Debilidad anabólica constitucional, estimulación de los productos de secreción y excreción, con tendencia esclerosante y de depósito en el sistema metabólico.",
                "Estreñimiento crónico, tendencia a espasmos, litiasis. Anexitis aguda y subaguda. Epicondilitis. Retención de loquios. Detención del crecimiento. Desnutrición. Prostatitis aguda (junto con Apis/Belladonna). Eczemas secos. Neurodermitis. Shock psíquico. Insuficiencia renal. Anuria. Uremia. D6: Artrosis deformante. Rinitis atrófica. Rinitis seca. Ocena. Sinusitis crónica. Asma. D6: Para favorecer la involución uterina post parto. Prurito senil (ó D20 Dil.). D6: Artritis reumatoidea en luna creciente (menguante Plumbum Silicicum D20 Dil.).",
                "—", "—", "Dil. D6–D30 / Trit. D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("051", "Argentum metallicum", "Plata metálica natural",
                "Trit. D3, D6 / Dil. D6, D8, D10, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Afecciones del organismo acuoso"),
                "Plata metálica natural, la aplicación de la plata abarca todo el acontecer acuoso del organismo.",
                "Plata metálica natural, la aplicación de la plata abarca todo el acontecer acuoso del organismo.",
                "—", "—", "Trit. D3, D6 / Dil. D6–D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("052", "Argentum metallicum praeparatum", "Plata metálica (espejo)",
                "Dil. D6, D8, D10, D12, D15, D20, D30 / Trit. D4, D6 / Ung. 0,4%", "Compuestas",
                Arrays.asList("Procesos metabólicos purulentos", "Saturnismo", "Colitis", "Craurosis vulvar", "Shock psíquico", "Desnutrición", "Amenorrea", "Mastitis puerperal", "Aceleración del crecimiento", "Delgadez constitucional", "Enteritis crónica", "Neurastenia", "Meningitis serosa", "Verrugas", "Depresión endógena"),
                "Favorece el anabolismo: estimulación y estructuración de procesos metabólicos purulentos.",
                "D6: Saturnismo. Colitis. Craurosis vulvar. Shock psíquico. Desnutrición. Detención del crecimiento. Asma. Amenorrea. Favorece la involución uterina post parto. D8-D15: Aceleración del crecimiento. D15: Delgadez constitucional. Enteritis crónica (junto con Cuprum D15 y Mercurius vivus D15 aa). D20: Agotamiento y cansancio. Anexitis aguda y subaguda. Trastornos de concentración y memoria. Microcefalia. D30 Dil.: Pediatría: Meningitis serosa (con Cuarzo D30 Dil.). D6 Dil.: Depresión endógena al comienzo, luego Mercurius auratus D15 Dil. D6: Verrugas. D6: Dolicogastria más Tabacum D6.",
                "—", "—", "Dil. D6–D30 / Trit. D4, D6 / Ung. 0,4% según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 9 (imagen 9) ───────────────────────────────────────────────

        lista.add(new Medicamento("053", "Argentum comp.",
                "Argentum met. praep. / Belladonna pl.tota / Vespa Crabro",
                "D30 / D3 / D3 aa.", "Dilución compuesta",
                Arrays.asList("Furunculosis", "Mastitis", "Empiema", "Absceso amigdalino", "Osteomielitis"),
                "—", "Furunculosis. Mastitis. Empiema. Absceso amigdalino. Osteomielitis.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Compuestos Purulentos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("054", "Argentum / Berberis comp.",
                "Argentum met. praep. / Berberis fructus / Cuarzo",
                "D20 / D3 / D12 aa.", "Dilución compuesta",
                Arrays.asList("Sinusitis", "Rinosinupatías alérgicas"),
                "—",
                "Sinusitis. Rinosinupatías alérgicas (alternar con Citrus/Cydonia 3%).",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("055", "Argentum D15 / Cuprum D15 / Mercurius vivus nat. D15 aa Dil.",
                "Argentum / Cuprum / Mercurius vivus nat.", "D15 aa", "Dilución compuesta",
                Arrays.asList("Debilidad constitucional", "Enteritis crónica"),
                "—", "Debilidad constitucional. Enteritis crónica.",
                "—", "—", "D15 aa según indicación.", "—",
                "Medicina Antroposófica / Compuestos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("056", "Argentum D30 / Echinacea angustifolia D3 aa",
                "Argentum / Echinacea angustifolia", "D30 / D3 aa", "Dilución compuesta",
                Arrays.asList("Estimulación de defensas", "Procesos sépticos", "Procesos infecciosos reiterativos", "Encefalitis", "Faringitis rebeldes", "Mastitis puerperal"),
                "—",
                "Estimulación de las defensas del organismo. Procesos sépticos. Procesos infecciosos reiterativos. Encefalitis. Faringitis rebeldes. Mastitis puerperal.",
                "—", "—", "D30/D3 aa según indicación.", "—",
                "Medicina Antroposófica / Inmunológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("057", "Argentum nitricum", "Nitrato de plata",
                "Dil. D4, D6, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Gastritis", "Cistitis", "Parandentosis", "Trastornos de memoria", "Neurastenia", "Insomnio", "Neurodermitis", "Herpes Zoster", "Flatulencia excesiva"),
                "Favorece el anabolismo en procesos metabólicos, especialmente en patología mucosa-respiratoria, cavidad bucal, gastrointestinal y sistema urogenital.",
                "D4: Gastritis. Cistitis (alternar con Hypericum D3). Tenesmo vesical. D12: Parandentosis (alternar con Symphitum D3). D12: Trastornos de la memoria. D12-D20: Neurastenia. D20: Insomnio. Trastornos de concentración y memoria. Neurodermitis. Herpes Zoster. Rango homeopático: Manera de ser temerosa, con ansiedad especialmente anticipando acontecimientos (miedo al examen). Apurado, precipitado. Desvalorización, sensación de abandono, sentimientos de fracaso. Niños con adelgazamiento progresivo y aspecto de viejo. Niños que roban sal y/o azúcar para chuparlos directamente. Gastralgias, úlcera gástrica. Diarreas pre-examen o por exceso de caramelos. Flatulencia excesiva.",
                "—", "—", "Dil. D4, D6, D12, D15, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("058", "Argentum per Bryophyllum", "—",
                "Dil. 1%, 0,1%", "Compuestas",
                Arrays.asList("Shock físico o anímico", "Agotamiento nervioso con insomnio", "Insomnio en la infancia", "Depresiones", "Anorexia nerviosa", "Intranquilidad psicomotora", "Disfunción cerebral mínima"),
                "Integración de los procesos metabólicos que se han independizado, por ejemplo en conductas histeriformes.",
                "Integración de los procesos metabólicos que se han independizado, por ejemplo en conductas histeriformes. Alteraciones del sueño, inquietud, miedos, agotamiento y debilidad. Para las consecuencias de shock físico o anímico. Agotamiento nervioso con insomnio. Insomnio en la infancia y en el curso de depresiones. Debilidad del metabolismo constructivo. 0,1%: Pediatría: Anorexia nerviosa. 1%: Pediatría: intranquilidad psicomotora. Insomnio. Disfunción cerebral mínima.",
                "—", "—", "Dil. 1%, 0,1% según indicación.", "—",
                "Medicina Antroposófica / Neurológicos / Pediatría", "Vademécum Antroposófico"));

        lista.add(new Medicamento("059", "Argentum per Thuja", "—",
                "Dil. 1%", "Compuestas",
                Arrays.asList("Debilidad metabólica", "Estados de agotamiento y debilidad anabólica", "Inflamaciones crónicas", "Hipomenorrea", "Oligomenorrea", "Supuraciones crónicas"),
                "Estimulación de la organización sensible en debilidad metabólica con alteración en la estructuración de las sustancias.",
                "Estimulación de la organización sensible en debilidad metabólica con alteración en la estructuración de las sustancias, por ejemplo estados de agotamiento y debilidad anabólica, inflamaciones crónicas. Secreciones bloqueadas (indicación del Argentum). Hipomenorrea u oligomenorrea. Supuraciones estancadas crónicas o constitucionales en paciente adiposo que requiere Argentum.",
                "—", "—", "Dil. 1% según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 10 (imagen 10) ─────────────────────────────────────────────

        lista.add(new Medicamento("060", "Arnica planta tota", "Árnica montana planta completa / Compuestas",
                "Dil. D3, D4, D6, D8, D10, D12, D15, D20, D30 / Tint. 10%, 20% / Ung. 10% / Fitospray", "Compuestas",
                Arrays.asList("Lesiones de tejidos y órganos", "Traumatismos mecánicos e isquémicos", "Contractura muscular", "Desgarramientos", "Aplastamientos", "Accidente cerebrovascular", "Conmoción cerebral", "Dolor precordial", "Heridas", "Eritemas", "Inflamación de articulaciones", "Quemaduras", "Faringitis seca", "Herpes Zoster", "Síndrome de Meniere", "Hipoacusia aguda", "Post-meningitis", "Arteriosclerosis", "Encefalitis", "Angor pectoris", "Anosmia", "Hiposmia post-gripal"),
                "Estimulación y armonización de los procesos metabólicos y de la forma en lesiones de los tejidos y órganos, especialmente tras ataques mecánicos e isquémicos.",
                "Contractura muscular. Desgarramientos. Aplastamientos. Accidente cerebro-vascular. Conmoción cerebral. Dolor precordial. Tratamiento de heridas. Eritemas. Inflamación de articulaciones. Estimulación y vivificación del sistema nervioso. D3 Dil.: Quemaduras. Abscesos dentarios (junto con Argentum nitricum D20). Anexitis (junto con Echinacea). D6: Faringitis seca. Enfermedad de Recklinghausen. D10: Herpes Zoster. D15: Síndrome de Meniere (junto con Ferrum hydroxydatum). D15: Hipoacusia aguda. D20: Conmoción cerebral. D20: Post-meningitis. Arteriosclerosis. Encefalitis (estado subagudo). D20: Pediatría: convalecencia de Meningitis serosa, de noche. D30: Angor pectoris agudo. D30: Anosmia e Hiposmia post-gripal. Ungüento: Ciatalgia. Reumatismo muscular, traumatismos agudos de toda clase. Tint.: Bursitis. Reumatismo (compresas). Traumatismos agudos de toda clase.",
                "—", "—", "Dil. D3–D30 / Tint. 10%, 20% / Ung. 10% / Fitospray según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("061", "Árnica comp./Apis Ung.",
                "Árnica pl.tota / Aconitum napellus / Betula folium / Mandrágora radix / Apis mellifica / Oleo Rosmarinus",
                "TM / TM / TM / TM / TM — Excip. c.s.p. 100g", "Ungüento",
                Arrays.asList("Afecciones reumáticas", "Neuritis", "Procesos osteoarticulares con calor", "Artritis reumatoidea", "Dolores de ciática y lumbago"),
                "—",
                "Afecciones reumáticas, neuritis, procesos osteoarticulares que requieran calor, artritis reumatoidea. Dolores de ciática y lumbago.",
                "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos Reumatológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 11 (imagen 11) ─────────────────────────────────────────────

        lista.add(new Medicamento("062", "Árnica pl. tota D15 / Aurum met.praep. D10 / Cor D10 aa",
                "Árnica / Aurum met. praep. / Cor", "D15 / D10 / D10 aa", "Dilución compuesta",
                Arrays.asList("Post-infarto", "Arritmia", "Extrasístole", "Bloqueo cardíaco"),
                "—",
                "Post-infarto. Arritmia. Extrasístole. Bloqueo. Coadyuvante, estabilizador de la terapia cardíaca.",
                "—", "—", "D15/D10 aa según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("063", "Arnica / Belladonna / Magnesium phosphoricum comp. Dil. (Belladonna compuesta)",
                "Árnica pl.tota / Belladonna pl.tota / Magnesium phosphoricum",
                "D10 / D10 / D6 aa", "Dilución compuesta",
                Arrays.asList("Epilepsia", "Arteriosclerosis con hipertensión"),
                "—",
                "Epilepsia. Arteriosclerosis con hipertensión.",
                "—", "—", "D10/D10/D6 aa según indicación.", "—",
                "Medicina Antroposófica / Neurológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("064", "Arnica / Betula comp.",
                "Árnica pl.tota / Betula cortex / Plumbum mellitum",
                "D20 / D2 / D20 aa", "Dilución compuesta",
                Arrays.asList("Arteriosclerosis", "Esclerosis cerebral", "Hipertensión"),
                "—", "Arteriosclerosis. Esclerosis cerebral. Hipertensión.",
                "—", "—", "D20/D2/D20 aa según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("065", "Arnica / Bryonia comp. Dil.",
                "Árnica pl.tota / Bryonia radix / Formica / Mandrágora radix",
                "D3 / D3 / D3 / D3 aa", "Dilución compuesta",
                Arrays.asList("Artralgias", "Artrosis", "Artritis reumatoidea", "Contracturas musculares"),
                "—",
                "Artralgias. Artrosis. Coadyuvante en artritis reumatoidea. Contracturas musculares. En procesos articulares crónicos por la acción de la Formica. Contribuye a atenuar rigideces músculotendinosas antiguas.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("066", "Árnica / Cepa / Symphytum",
                "Árnica pl.tota / Cepa bulbus / Symphytum radix",
                "D3 / D3 / D3 aa.", "Dilución compuesta",
                Arrays.asList("Fracturas óseas", "Osteomielitis", "Epicondilitis", "Bursitis", "Periodontitis"),
                "—",
                "Fracturas óseas. Osteomielitis. Epicondilitis. Bursitis. Periodontitis.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Traumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("067", "Árnica / Echinacea comp. (Wecesin) Polvo, Ungüento",
                "Árnica pl.tota / Echinacea purpúrea pl.tota / Caléndula herba / Cuarzo / Stibium met. praep.",
                "2,50g / 1,66g / 1,65g / 0,10g / 0,10g — Excip. c.s.p. 100,00g", "Polvo / Ungüento",
                Arrays.asList("Heridas", "Herpes Zoster", "Flujo inflamatorio", "Lupus eritematoso", "Eczemas", "Grietas del pezón", "Micosis", "Ulceraciones", "Fisuras anales"),
                "—",
                "Heridas. Herpes Zoster. Flujo inflamatorio. Lupus eritematoso (polvo). Ung: eczemas y heridas superficiales secas, grietas del pezón, micosis, ulceraciones, fisuras anales.",
                "—", "—", "Polvo / Ung. tópico según indicación.", "—",
                "Medicina Antroposófica / Dermatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("068", "Árnica comp. / Formica Ung.",
                "Árnica pl.tota / Aconitum napellus / Betula folium / Mandrágora radix / Formica / Oleo Rosmarinus",
                "TM 7,0g / TM 2,0g / TM 4,0g / TM 3,0g / TM 3,0g / 1,0g — Excip. c.s.p.", "Ungüento",
                Arrays.asList("Trastornos reumáticos", "Neuritis", "Artrosis", "Disolvente de depósitos artrósicos"),
                "—",
                "Trastornos reumáticos, neuritis, artrosis, disolvente de depósitos artrósicos.",
                "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos Reumatológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 12 (imagen 12) ─────────────────────────────────────────────

        lista.add(new Medicamento("069", "Arnica / Levisticum D3 Dil.",
                "Árnica pl.tota / Levisticum radix / Apis mellifica",
                "D3 / D3 / D3 aa", "Dilución compuesta",
                Arrays.asList("Ciatalgia", "Lumbalgia", "Neuralgia", "Dolores articulares", "Herpes Zoster", "Reumatismo muscular"),
                "—",
                "Ciatalgia. Lumbalgia. Neuralgia. Dolores articulares sin manifestaciones clínicas. Herpes Zoster. Alternar con Fórmica D3: Reumatismo muscular.",
                "—", "—", "D3 aa según indicación.", "—",
                "Medicina Antroposófica / Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("070", "Arnica / Urtica urens (Combudoron)",
                "Árnica pl.tota / Urtica urens herba",
                "2,5g Tint. / 47,5g — Excip.c.s.p. 100,0g (Tint.) | 0,5g Árnica / 9,5g Urtica urens (Ung. y Gel)", "Tintura / Ungüento / Gel",
                Arrays.asList("Quemaduras", "Eczema alérgico", "Picaduras de insectos", "Quemaduras solares"),
                "—",
                "Tintura: Quemaduras. Fitospray: Eczema alérgico. Picaduras de insectos. Protección de piel nueva. Ung.: Quemaduras de primer grado, quemaduras solares, picaduras de insectos.",
                "—", "—", "Tint. / Ung. / Gel tópico según indicación.", "—",
                "Medicina Antroposófica / Dermatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("071", "Arnica radix", "Árnica montana raíz / Compuestas",
                "Dil. D4, D6, D10, D20, D30", "Compuestas",
                Arrays.asList("Enfermedades inflamatorias degenerativas del sistema nervioso", "Neuritis", "Esclerosis múltiple", "Braquialgia", "Molestias post-conmocionales", "Estados post-encefálicos"),
                "Favorece el proceso de curación de los tejidos y órganos, con especial acentuación en los procesos de la forma, por ej. enfermedades inflamatorias degenerativas y traumáticas del sistema nervioso.",
                "Efecto directo sobre el sistema nervioso. D6: Neuritis. D20: Esclerosis múltiple. Molestias post-conmocionales. Estados post-encefálicos. Braquialgia (junto con Vespa Crabro D4).",
                "—", "—", "Dil. D4, D6, D10, D20, D30 según indicación.", "—",
                "Medicina Antroposófica / Neurológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("072", "Arsenicum album", "Anhídrido arsenioso",
                "Dil. D4, D6, D8, D10, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Asma bronquial", "Inflamaciones del tracto respiratorio", "Alteraciones del ritmo cardíaco", "Depresiones con irritabilidad", "Hipercolesterolemias", "Verrugas", "Neuritis post-herpéticas", "Gastroenteritis", "Fiebre del heno", "Rinitis", "Psoriasis", "Colitis", "Eczemas secos", "Neurodermitis", "Diarreas"),
                "En general para tonificar y fortalecer. Inflamaciones agudas y crónicas del tracto respiratorio.",
                "En general para tonificar y fortalecer. Inflamaciones agudas y crónicas del tracto respiratorio, asma bronquial. Alteraciones del ritmo cardíaco. Estados irritativos agudos y crónicos en el sistema digestivo. Depresiones con irritabilidad, apatía y en estados de pánico. D4: Diarreas. D4-D6: Hipercolesterolemias. D6: Verrugas. Neuritis post-herpéticas. Gastroenteritis. Hipoacusia aguda. D10: Fiebre del heno. Rinitis. Psoriasis. D30: Asma. Colitis. Eczemas secos. Neurodermitis. Pediatría: constitución histérica. Rango homeopático: Ansiedad muy marcada con inquietud o agitación, sentimientos de culpa, temor a morir. Pulcro, ordenado y muy escrupuloso. Postración, debilidad. Su momento de agravación es después de medianoche, entre una y tres de la mañana.",
                "—", "—", "Dil. D4–D30 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        // ── PÁGINA 13 (imagen 13) ─────────────────────────────────────────────

        lista.add(new Medicamento("073", "Artemisia vulgaris", "—",
                "Dil. D1, D2, D4, D6", "Compuestas",
                Arrays.asList("Trastornos digestivos"),
                "—", "Digestiva.",
                "—", "—", "Dil. D1, D2, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("074", "Artemisia comp. Dil.",
                "Artemisia absinthium herba / Carum carvi fructus / Geum urbanum rhizoma / Senna fructus",
                "D1 50,0g / D1 12,5g / TM 3,8g / D1 5,0g — Excip. c.s.p. 100,0g", "Dilución compuesta",
                Arrays.asList("Debilidad gástrica", "Hipoacidez", "Dispepsia fermentativa", "Gastritis crónica", "Flatulencia", "Meteorismo", "Constipación"),
                "—",
                "Debilidad gástrica. Hipoacidez. Estimulación de la secreción gastrointestinal. Inversión peristáltica. Dispepsia fermentativa. Gastritis crónica. Flatulencia. Meteorismo. Constipación.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("075", "Arum Triphyllum", "Nabo indio",
                "Dil. D6", "Compuestas",
                Arrays.asList("Inflamación de mucosas", "Laringitis", "Faringitis", "Bronquitis", "Afonía", "Enfermedades infecciosas con ronquera"),
                "—",
                "Inflamación de mucosas, laringe, faringe, bronquios. Afonía y faringitis por cansancio de cuerdas vocales. Enfermedades infecciosas con ronquera.",
                "—", "—", "Dil. D6 según indicación.", "—",
                "Medicina Antroposófica / Respiratorios", "Vademécum Antroposófico"));

        lista.add(new Medicamento("076", "Asa foetida", "Resina de especies de Férula / Umbelíferas",
                "Dil. D4, D6", "Compuestas",
                Arrays.asList("Histeria", "Hipocondría", "Globus histericus", "Rinitis atrófica", "Inversión del peristaltismo gástrico", "Dolores óseos"),
                "—",
                "Indicado tanto en la histeria como en la hipocondría. D4: Globus histericus. Rinitis atrófica. Inversión del peristaltismo gástrico. Dolores óseos.",
                "—", "—", "Dil. D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Neurológicos / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("077", "Aspidium filix mas rhizoma", "Helecho macho raíz / Filices",
                "Dil. D2, D4, D6", "Compuestas",
                Arrays.asList("Teniasis", "Nefrosis"),
                "—", "Teniasis. D2-D4: Nefrosis.",
                "—", "—", "Dil. D2, D4, D6 según indicación.", "—",
                "Medicina Antroposófica / Digestivos / Nefrológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("078", "Aspidium filix mas Spora", "Helecho macho esporas",
                "Dil. D3", "Compuestas",
                Arrays.asList("Ver indicación específica"),
                "—", "Helecho macho esporas. Dil. D3.",
                "—", "—", "Dil. D3 según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        lista.add(new Medicamento("079", "Aspidium / Salix comp. Dil. (Digestodoron)",
                "Salix alba / Dryopteris / Phyllitis / Polypodium", "—", "Dilución compuesta",
                Arrays.asList("Acidez estomacal", "Meteorismo", "Estreñimiento", "Diarrea", "Disbacteriosis", "Espasmos intestinales", "Pancreopatía", "Regeneración de flora intestinal"),
                "Trastornos de la actividad rítmica del tracto gastrointestinal del tipo secretor y motor.",
                "Trastornos de la actividad rítmica del tracto gastrointestinal del tipo secretor y motor, y problemas derivados de los mismos: acidez estomacal, meteorismo, estreñimiento, diarrea, disbacteriosis, espasmos, trastornos funcionales después de una resección intestinal, hiper e hipoclorhidria, pancreopatía. Regeneración de la flora intestinal.",
                "—", "—", "Según formulación compuesta.", "—",
                "Medicina Antroposófica / Digestivos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("080", "Aurum metallicum", "Oro metálico",
                "Trit. D4 / Dil. D8, D10, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Estimulación y armonización de la organización rítmica"),
                "Estimulación y armonización de la organización rítmica.",
                "Trit. D4. Dil. D8, D10, D12, D15, D20, D30.",
                "—", "—", "Trit. D4 / Dil. D8–D30 según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("081", "Aurum metallicum praeparatum", "Oro metálico (espejo)",
                "Dil. D8, D9, D10, D12, D15, D20, D30", "Compuestas",
                Arrays.asList("Aborto inminente", "Trastornos de formación de huesos", "Arritmias", "Extrasístoles", "Angustia cardíaca", "Estenocardia", "Hipertensión", "Fobias", "Hipertiroidismo", "Cor nervosum", "Post-infarto", "Insuficiencia cardíaca", "Endocarditis", "Miocarditis", "Neurastenia", "Depresión endógena", "Esclerosis múltiple", "Angiopatía periférica"),
                "Estimulación y armonización de la organización rítmica.",
                "Trit. D6, D8, D10, D12, D15. D6: Aborto inminente. Trastornos de la formación de huesos. D6-D12: Arritmias y extrasístoles. Angustia cardíaca. Estenocardia. D8 Trit.: Hipertensión al mediodía. Fobias. Distonía neurovegetativa. D10: Hipertiroidismo. Cor nervosum. Post-infarto. Trastornos cardíacos en epilepsia. Elefantiasis. D6-D10-D30: Insuficiencia cardíaca. D10 más Stibium D8: Endocarditis. Miocarditis. D15-D30: Depresión endógena. Neurastenia. D30 más Plumbum D20: Pre-apoplejía. Angor pectoris (hipertensión). D30: Esclerosis múltiple. Angiopatía periférica.",
                "—", "—", "Dil. D8–D30 / Trit. D6–D15 según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        // ── PÁGINA 14 (imagen 14) ─────────────────────────────────────────────

        lista.add(new Medicamento("082", "Aurum D30 / Equisetum herba D20 aa Dil.",
                "Aurum / Equisetum herba", "D30 / D20 aa", "Dilución compuesta",
                Arrays.asList("Metástasis óseas", "Conjuntivitis alérgica", "Esclerosis múltiple", "Dermatitis secas", "Fiebre de heno", "Osteopatías"),
                "—",
                "Coadyuvante en metástasis óseas. Conjuntivitis alérgica. Esclerosis múltiple. Dermatitis secas. Fiebre de heno. Osteopatías. Dil.: Uso prolongado y en niños o para afianzar lo logrado por el uso inyectable.",
                "—", "—", "D30/D20 aa según indicación.", "—",
                "Medicina Antroposófica / Oncológicos / Reumatológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("083", "Aurum D10 / Ferrum sidereum D10 aa Dil.",
                "Aurum / Ferrum sidereum", "D10 aa", "Dilución compuesta",
                Arrays.asList("Fobias", "Agorafobia", "Neurastenia", "Angustia cardíaca", "Estados depresivos"),
                "—",
                "Fobias (agorafobia). Neurastenia. Angustia cardíaca. Estados depresivos.",
                "—", "—", "D10 aa según indicación.", "—",
                "Medicina Antroposófica / Neurológicos / Psiquiátricos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("084", "Aurum / Hyoscyamus comp. Dil.",
                "Aurum met. praep. / Hyoscyamus pl.tota / Stibium met. praep.",
                "D10 / D5 / D6 aa", "Dilución compuesta",
                Arrays.asList("Cardiopatías funcionales", "Arritmias", "Extrasístoles", "Taquicardia", "Tinitus", "Zumbidos"),
                "—",
                "Cardiopatías funcionales. Arritmias. Extrasístoles. Taquicardia. Estabilización general. Tinitus. Zumbidos en pacientes jóvenes (u Olivenita D8, o Nontronita o Arandisita).",
                "—", "—", "D10/D5/D6 aa según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("085", "Aurum / Lavanda Ung.",
                "Aurum met. praep. / Oleum aeth. Lavandulae",
                "D4 10,0g / 5,0g — Excip. c.s.p. 100,0g", "Ungüento",
                Arrays.asList("Ver Aurum / Lavanda / Rosa"),
                "—", "Ungüento de Aurum met. praep. D4 y Oleum aeth. Lavandulae.",
                "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("086", "Aurum / Lavanda / Rosa Ung.",
                "Aurum met. praep. / Oleum aeth. Lavandulae / Oleum aeth. Rosae",
                "D4 10,0g / 1,0g / 1,0g — Excip. c.s.p. 100,0g", "Ungüento",
                Arrays.asList("Palpitaciones cardíacas", "Sensación de opresión cardíaca", "Neurosis cardíacas", "Dermatitis", "Aftas"),
                "—",
                "Palpitaciones cardíacas. Sensación de opresión cardíaca. Neurosis cardíacas. Dermatitis. Aftas.",
                "—", "—", "Uso tópico.", "—",
                "Medicina Antroposófica / Ungüentos Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("087", "Aurum / Strophantus",
                "Aurum met. praep. / Strophantus", "D10 / D8 aa.", "Dilución compuesta",
                Arrays.asList("Acción cardiotónica y reguladora"),
                "—", "Acción cardiotónica y reguladora.",
                "—", "—", "D10/D8 aa según indicación.", "—",
                "Medicina Antroposófica / Cardiológicos", "Vademécum Antroposófico"));

        lista.add(new Medicamento("088", "Aurum per Hypericum (Hypericum Auro cultum)",
                "—", "Dil. 1%, 0,1%", "Compuestas",
                Arrays.asList("Ver indicación en ficha completa"),
                "—", "Hypericum Auro cultum. Dil. 1%, 0,1%.",
                "—", "—", "Dil. 1%, 0,1% según indicación.", "—",
                "Medicina Antroposófica / Compuestas", "Vademécum Antroposófico"));

        return lista;
    }
}

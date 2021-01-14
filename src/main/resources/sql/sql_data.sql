INSERT INTO public.symulations
(id, contagiousness, cycle_time, initial_infected_size, mortality, name, population_size, simulation_time)
VALUES (10, 1.5, 10, 1000, 0.03, 'first', 10000000, 300);
INSERT INTO public.symulations
(id, contagiousness, cycle_time, initial_infected_size, mortality, name, population_size, simulation_time)
VALUES (11, 1.4, 10, 100, 0.03, 'second', 2000000, 300);

INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (10, 0, 9999000, 1000, 0, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (11, 30, 9997500, 1500, 970, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (12, 45, 9996250, 2250, 1455, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (13, 67.5, 9994375, 3375, 2182.5, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (14, 101.25, 9991562.5, 5062.5, 3273.75, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (15, 151.875, 9987343.75, 7593.75, 4910.625, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (16, 227.8125, 9981015.625, 11390.625, 7365.9375, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (17, 341.71875, 9971523.4375, 17085.9375, 11048.90625, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (18, 512.578125, 9957285.15625, 25628.90625, 16573.359375, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (19, 768.8671875, 9935927.734375, 38443.359375, 24860.0390625, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (20, 1153.30078125, 9903891.6015625, 57665.0390625, 37290.05859375, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (21, 1729.951171875, 9855837.40234375, 86497.55859375, 55935.087890625, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (22, 2594.9267578125, 9783756.103515625, 129746.337890625, 83902.6318359375, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (23, 3892.39013671875, 9675634.155273438, 194619.5068359375, 125853.94775390625, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (24, 5838.585205078125, 9513451.232910156, 291929.26025390625, 188780.92163085938, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (25, 8757.877807617188, 9270176.849365234, 437893.8903808594, 283171.38244628906, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (26, 13136.816711425781, 8905265.274047852, 656840.8355712891, 424757.0736694336, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (27, 19705.225067138672, 8357897.911071777, 985261.2533569336, 637135.6105041504, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (28, 29557.837600708008, 7536846.866607666, 1477891.8800354004, 955703.4157562256, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (29, 44336.75640106201, 6305270.299911499, 2216837.8200531006, 1433555.1236343384, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (30, 66505.13460159302, 4457905.449867249, 3325256.730079651, 2150332.6854515076, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (31, 99757.70190238953, 1686858.1748008728, 4987885.095119476, 3225499.0281772614, 10);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (32, 0, 1999900, 100, 0, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (33, 3, 1999760, 140, 97, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (34, 4.2, 1999664, 196, 135.8, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (35, 5.88, 1999529.6, 274.4, 190.12, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (36, 8.232, 1999341.44, 384.15999999999997, 266.168, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (37, 11.524799999999999, 1999078.016, 537.824, 372.63519999999994, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (38, 16.134719999999998, 1998709.2224, 752.9535999999999, 521.6892799999999, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (39, 22.588607999999997, 1998192.91136, 1054.13504, 730.3649919999999, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (40, 31.624051199999997, 1997470.0759039999, 1475.7890559999998, 1022.5109888, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (41, 44.27367167999999, 1996458.1062656, 2066.1046783999996, 1431.5153843199998, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (42, 61.983140351999985, 1995041.34877184, 2892.5465497599994, 2004.1215380479996, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (43, 86.77639649279998, 1993057.8882805759, 4049.565169663999, 2805.7701532671995, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (44, 121.48695508991996, 1990281.0435928062, 5669.391237529598, 3928.078214574079, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (45, 170.0817371258879, 1986393.4610299289, 7937.147732541436, 5499.3095004037095, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (46, 238.11443197624308, 1980950.8454419007, 11112.00682555801, 7699.033300565193, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (47, 333.3602047667403, 1973331.1836186608, 15556.809555781212, 10778.646620791269, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (48, 466.70428667343634, 1962663.6570661252, 21779.533378093696, 15090.105269107777, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (49, 653.3860013428109, 1947729.119892575, 30491.346729331173, 21126.147376750887, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (50, 914.7404018799351, 1926820.767849605, 42687.88542106364, 29576.606327451238, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (51, 1280.636562631909, 1897549.0749894471, 59763.0395894891, 41407.24885843173, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (52, 1792.8911876846728, 1856568.7049852263, 83668.25542528473, 57970.14840180442, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (53, 2510.0476627585417, 1799196.1869793169, 117135.55759539861, 81158.20776252619, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (54, 3514.066727861958, 1718874.6617710432, 163989.78063355805, 113621.49086753666, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (55, 4919.693419006741, 1606424.5264794608, 229585.69288698127, 159070.0872145513, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (56, 6887.570786609438, 1448994.3370712448, 321419.97004177375, 222698.12210037184, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (57, 9642.599101253212, 1228592.0718997428, 449987.9580584832, 311777.37094052054, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (58, 13499.638741754496, 920028.9006596403, 629983.1412818765, 436488.3193167287, 11);
INSERT INTO public.populations (id, died, healthy, infected, recovered, symulation_id) VALUES (59, 18899.494238456293, 488040.4609234964, 881976.397794627, 611083.6470434202, 11);

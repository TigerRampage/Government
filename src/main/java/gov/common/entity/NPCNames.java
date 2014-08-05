package gov.common.entity;

import gov.common.core.GovSettings;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

public class NPCNames {
	public static String getRandomName() {
		List<String> list = GovSettings.npcNames;
		Random rand = new Random();
		int r = rand.nextInt(list.size());
		return list.get(r);
	}
}

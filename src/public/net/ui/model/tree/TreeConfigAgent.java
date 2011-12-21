package net.ui.model.tree;

import java.io.InputStream;
import java.io.Serializable;

import org.apache.commons.digester.Digester;

/**
 * ���нṹ���ô���
 * 
 * @author qilin
 * 
 */
public class TreeConfigAgent implements Serializable {

	public static TreeBean getTreeConfig(InputStream aTreeConfig)
			throws Exception {

		Digester digester = new Digester();

		digester.setValidating(false);

		digester.addObjectCreate("tree", TreeBean.class);

		digester.addSetProperties("tree", "id", "id");

		digester.addSetProperties("tree", "imageBase", "imageBase");

		digester.addObjectCreate("tree/nodeDefine/node", NodeBean.class);

		digester.addSetProperties("tree/nodeDefine/node", "id", "id");

		digester.addSetProperties("tree/nodeDefine/node", "label", "label");

		digester.addSetProperties("tree/nodeDefine/node", "image", "image");

		digester.addSetProperties("tree/nodeDefine/node", "isLeaf", "leaf");

		digester.addSetProperties("tree/nodeDefine/node", "nodePanel",
				"nodePanel");

		digester.addSetProperties("tree/nodeDefine/node", "hidden", "hidden");

		digester.addObjectCreate("tree/nodeDefine/node/property",
				PropertyBean.class);

		digester.addSetProperties("tree/nodeDefine/node/property");

		digester.addSetNext("tree/nodeDefine/node/property", "addProperty");

		digester.addObjectCreate(
				"tree/nodeDefine/node/subNodeBuilderList/nodeBuilder",
				SubNodeBuilderBean.class);

		digester.addSetProperties("tree/nodeDefine/node/subNodeBuilderList/nodeBuilder");

		digester.addSetNext(
				"tree/nodeDefine/node/subNodeBuilderList/nodeBuilder",
				"addSubNodeBuilder");

		digester.addObjectCreate(
				"tree/nodeDefine/node/subNodeBuilderList/nodeBuilder/property",
				PropertyBean.class);

		digester.addSetProperties("tree/nodeDefine/node/subNodeBuilderList/nodeBuilder/property");

		digester.addSetNext(
				"tree/nodeDefine/node/subNodeBuilderList/nodeBuilder/property",
				"addProperty");

		digester.addObjectCreate(
				"tree/nodeDefine/node/actionList/action/property",
				PropertyBean.class);

		digester.addSetProperties("tree/nodeDefine/node/actionList/action/property");

		digester.addSetNext("tree/nodeDefine/node/actionList/action/property",
				"addProperty");

		digester.addSetNext("tree/nodeDefine/node", "addNodeDefine");

		digester.addObjectCreate("tree/rootNode", TreeNodeBean.class);

		digester.addSetProperties("tree/rootNode", "id", "id");

		digester.addSetNext("tree/rootNode", "addRootNode");

		digester.addObjectCreate("*/subNode", TreeNodeBean.class);

		digester.addSetProperties("*/subNode");

		digester.addSetNext("*/subNode", "addSubNode");

		TreeBean treeConfig = (TreeBean) digester.parse(aTreeConfig);

		return treeConfig;
	}
}

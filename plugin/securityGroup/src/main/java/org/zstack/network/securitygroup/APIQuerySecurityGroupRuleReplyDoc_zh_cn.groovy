package org.zstack.network.securitygroup

import org.zstack.header.errorcode.ErrorCode
import org.zstack.network.securitygroup.SecurityGroupRuleInventory

doc {

	title "安全组（Security Group）清单"

	ref {
		name "error"
		path "org.zstack.network.securitygroup.APIQuerySecurityGroupRuleReply.error"
		desc "错误码，若不为null，则表示操作失败, 操作成功时该字段为null",false
		type "ErrorCode"
		since "0.6"
		clz ErrorCode.class
	}
	ref {
		name "inventories"
		path "org.zstack.network.securitygroup.APIQuerySecurityGroupRuleReply.inventories"
		desc "null"
		type "List"
		since "0.6"
		clz SecurityGroupRuleInventory.class
	}
}

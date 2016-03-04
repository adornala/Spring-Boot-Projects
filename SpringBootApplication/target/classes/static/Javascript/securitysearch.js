/**
 * Dornala
 */

		function search_security()
		{
			var url = '/results';
			if($('#securityusername').val()!= ''){
				url = url + '/' +$('#securityusername').val();
			}
			$("#securityresults").load(url);
		}